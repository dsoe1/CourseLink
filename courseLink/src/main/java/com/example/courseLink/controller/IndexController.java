package com.example.courseLink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String listHome() {
        return "index";
    }

    @GetMapping("/library")
    public String listLibrary() {
        return "library";
    }

}
