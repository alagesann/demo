package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
// Create a GetRequest to /hello
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
