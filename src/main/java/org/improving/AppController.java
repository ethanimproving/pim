package org.improving;

import org.improving.database.JPAUtility;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

@Controller
public class AppController {

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.put("products", getProductList());
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

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
