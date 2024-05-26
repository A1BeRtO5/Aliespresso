package com.spring.Alieapresso.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String tovari(){
        return "lalala";
    }
    @GetMapping("/1")
    public String tovari1(){
        return "lalala1";
    }
    @GetMapping("/2")
    public String tovari2(){
        return "lalala2";
    }
}
