package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnotherController {
    @GetMapping("/")
    public ModelAndView hello() {

        String helloWorldMessage = "Another world from java2blog!";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}
