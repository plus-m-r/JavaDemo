package com.example.demo.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from Hello Service!";
    }
    
    @GetMapping("/info")
    public String info() {
        return "Hello Service Info: Running on port 8082";
    }
}
