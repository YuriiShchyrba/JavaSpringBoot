package com.learning.javaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("welcome")
    public String helloWorld() {
        return "Hello Juan Contreras!";
    }
}
