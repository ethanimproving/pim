package org.improving;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String home() {
        return "index";
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
