package com.spring.Alieapresso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "html/index.html"; // Зміна тут
    }

    @GetMapping("/page2")
    public String page2() {
        return "html/page2.html"; // Зміна тут
    }
}
