package com.example.helloworldspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot!";
    }

    @GetMapping("/hello")
    public String helloEndpoint() {
        return "Hello World!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Greetings from your Spring Boot application!";
    }
}
