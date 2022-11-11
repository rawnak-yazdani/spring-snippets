package io.welldev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/robbii")
    public String getHome() {
        return "home";
    }
}
