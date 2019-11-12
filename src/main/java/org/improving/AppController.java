package org.improving;

import org.dom4j.rule.Mode;
import org.improving.database.JPAUtility;
import org.improving.exceptions.SystemErrorException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AppController {
    private ProductRepository productRepository = new ProductRepository();
    private List<Product> products = productRepository.getProducts();

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.put("products", products);
        return "index";
    }

    @RequestMapping("/product")
    public String product(ModelMap model, @RequestParam int id) {
        model.put("product", productRepository.getProduct(id));
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
        // TODO: UnsupportedOperationException: null
        products.add(product);
        return "redirect:/";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/bad")
    public String errorHandling(){
        throw new SystemErrorException();
    }
}
