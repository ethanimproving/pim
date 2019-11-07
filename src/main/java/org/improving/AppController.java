package org.improving;

import org.dom4j.rule.Mode;
import org.improving.database.JPAUtility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
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
            products.forEach(product -> System.out.println(product.getName() + " " + product.getVersion()));
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
    public String form() {
        return "form";
    }

    @PostMapping("/form/add")
    public String add(ModelMap model, @ModelAttribute Product product) {
        products.add(product);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
