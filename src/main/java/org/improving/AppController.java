package org.improving;

import org.dom4j.rule.Mode;
import org.improving.database.JPAUtility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.validation.Valid;
import java.util.List;

@Controller
public class AppController {
    private List<Product> products = getProductList();

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.put("products", products);
        return "index";
    }

    public static List<Product> getProductList() {
        EntityManager em = JPAUtility.getEntityManager();
        String query = "select p from Product as p where p.id is not null";
        TypedQuery<Product> tq = em.createQuery(query, Product.class);
        List<Product> products;
        try {
            products = tq.getResultList();
            return products;
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/product")
    public String product() {
        return "product";
    }

    @RequestMapping("/form")
    public String form(ModelMap model) {
        model.put("product", new Product());
        return "form";
    }

    @PostMapping("/form/add")
    public String add(ModelMap model, @Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Error!");
            return "form";
        }
        products.add(product);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
