package com.learning.javaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("welcome")
    public String welcome() {
        return "Hello Juan Contreras!";
    }
}
