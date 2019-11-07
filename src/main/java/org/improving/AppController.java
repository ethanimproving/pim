package org.improving;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AppController {

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.put("products", productList());
        return "index";
    }

    private List<Product> productList() {
        List<Product> books = new ArrayList<>();
        books.add(new Product(
                "Generic Fresh Bacon",
                287,
                783,
                "4.0.0",
                "Your Mom"
        ));
        books.add(new Product(
                "Practical Granite",
                830,
                598,
                "4.0.0",
                "Military"
        ));
        return books;
    }

    @RequestMapping("/product")
    public String product() {
        return "product";
    }

    @RequestMapping("/form")
    public String form() {
        return "form";
    }
}
