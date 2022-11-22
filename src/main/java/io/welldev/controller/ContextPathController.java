package io.welldev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContextPathController {
    /**
     * Scope of ModelAndView is current request
     */
    @GetMapping("/")
    public ModelAndView hello() {

        String helloWorldMessage = "This is coming from ModelAndView";
        return new ModelAndView("hello", "message", helloWorldMessage);
    }
}
