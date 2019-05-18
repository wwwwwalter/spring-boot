package com.walter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
    @RequestMapping("/hello")
    public String helloThymeleaf(Model model) {
        model.addAttribute("name", "walter");
        return "thymeleaf";
    }
}
