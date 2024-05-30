package com.spring.Alieapresso.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/page1.html")
    public String tovari(){
        return "page1";
    }
    @GetMapping("/page2.html")
    public String tovari1(){
        return "page2";
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/index.html")
    public String index(){
        return "index.html";
    }
    @GetMapping("/5")
    public String lalala(){
        return "test";
    }

}
