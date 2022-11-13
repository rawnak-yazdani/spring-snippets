package io.welldev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController {

    @GetMapping("/robbii")
    public String getHome(Locale locale, Model model) {
        return "home";
    }
}
