package com.example.testdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControllerRest {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}
