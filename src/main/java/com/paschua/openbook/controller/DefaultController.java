package com.paschua.openbook.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @Value("${welcome.message}")
    private String message;

    @GetMapping("/")
    public String home1(Model model) {
        model.addAttribute("message", message);
        return "home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", message);
        return "home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }
}
