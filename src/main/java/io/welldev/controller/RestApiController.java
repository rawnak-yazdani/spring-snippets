package io.welldev.controller;

import io.welldev.dataclass.Greeting;
import io.welldev.dataclass.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingService greetingService;

//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
////        return "hello";
//    }

    @RequestMapping("/greeting")
    public List<Greeting> greeting() {
        return greetingService.getEmployees();
//        return "hello";
    }
}
