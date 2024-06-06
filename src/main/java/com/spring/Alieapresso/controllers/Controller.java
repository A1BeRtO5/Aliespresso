package com.spring.Alieapresso.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String homePage(){
        return "/html/home";
    }
    @GetMapping("/aboutUs")
    public String aboutUsPage(){
        return "/html/aboutUs";
    }
    @GetMapping("/shop")
    public String shopPage(){
        return "/html/shop";
    }
    @GetMapping("/contacts")
    public String contactsPage(){
        return "/html/contacts";
    }
    @GetMapping("/basket")
    public String basketPage(){
        return "/html/basket";
    }

}
