package com.example.demoSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("login")
    public String loginPage() {
        return "fancy-login";
    }

    @GetMapping("access-denied")
    public String accessDenied() {
        return "access-denied"; // This will return the access-denied.html template
    }
}
