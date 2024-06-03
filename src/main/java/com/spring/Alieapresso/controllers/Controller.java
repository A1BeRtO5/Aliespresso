package com.spring.Alieapresso.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/page1.html")
    public String tovari(){
        return "/html/page1";
    }
    @GetMapping("/page2.html")
    public String tovari1(){
        return "/html/page2";
    }
    @GetMapping("/")
    public String home(){
        return "/html/home";
    }
    @GetMapping("/index.html")
    public String index(){
        return "/html/index.html";
    }
    @GetMapping("/5")
    public String lalala(){
        return "/html/test.html";
    }
    @GetMapping("/file.html")
    public String lalalads(){
        return "/html/file.html";
    }

}
