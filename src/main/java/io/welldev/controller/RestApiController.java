package io.welldev.controller;

import io.welldev.dataclass.Greeting;
import io.welldev.dataclass.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/greeting")
public class RestApiController {
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingService greetingService;

//    @GetMapping("/greeting")
//    public Greeting greeting(@RequestParam String name) {
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
////        return "hello";
//    }

//    @RequestMapping("/greeting")
    @GetMapping("/greeting")
    public List<Greeting> greeting() {
        return greetingService.getEmployees();
//        return "hello";
    }

    @GetMapping("/greeting/{id}")
    public Greeting getGreeting(@PathVariable("id") Long id) {
        return greetingService.getEmployee(id);
    }

    @PostMapping("/greeting")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Greeting> postGreeting(@RequestBody Greeting greeting) {
        greetingService.getEmployees().add(greeting);
        return greetingService.getEmployees();
    }

    @PutMapping(value = "/greeting/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Greeting> update(@PathVariable( "id" ) Long id, @RequestBody Greeting greeting) {
        greetingService.updateEmployee(id, greeting);
        return greetingService.getEmployees();
    }

    @DeleteMapping(value = "/greeting/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Greeting> delete(@PathVariable("id") Long id) {
        greetingService.deleteEmployee(id);
        return greetingService.getEmployees();
    }
}
