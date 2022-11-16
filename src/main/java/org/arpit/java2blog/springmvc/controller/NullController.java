package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NullController {
    @GetMapping("/null")
    public String hello(Model model) {
        model.addAttribute("tipu", "sultan");
        return "hello2";
    }
}
