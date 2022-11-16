package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HelloWorldController {
    /**
     * Scope of HttpSession is whole session
     */
    //    @RequestMapping("/helloworld")
    @GetMapping("/helloworld")
    public String hello(HttpSession httpSession, Model model) {
        httpSession.setAttribute("name", "Rawnak");
        model.addAttribute("name2", "Yazdani");

//        String helloWorldMessage = "Hello world from java2blog!";
//        return new ModelAndView("hello", "message", helloWorldMessage);
        return "hello";
    }
}
 