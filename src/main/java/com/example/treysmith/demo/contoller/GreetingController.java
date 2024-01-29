package com.example.treysmith.demo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping(path = "/")
    public String getGreeting() {
        return "Hello, World! Thanks for being here on the homepage.";
    }
}
