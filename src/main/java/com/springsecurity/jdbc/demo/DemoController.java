package com.springsecurity.jdbc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcome() {
        return "<h1>Hi! Welcome to home page.<h1>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h1>Hello! User</h1>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h1>Hello! Admin</h1>";
    }

}

