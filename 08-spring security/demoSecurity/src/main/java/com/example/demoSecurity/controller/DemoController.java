package com.example.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String home() {
        return "home"; // This will return the home.html template
    }

    @GetMapping("/leaders")
    public String leaders() {
        return "leaders"; // This will return the leaders.html template
    }

    @GetMapping("/systems")
    public String systems() {
        return "systems"; // This will return the systems.html template
    }
}
