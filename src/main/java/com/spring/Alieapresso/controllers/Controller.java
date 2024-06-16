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
    @GetMapping("/portfolioP1")
    public String portfolioP1(){
        return "/html/portfolioP1";
    }
    @GetMapping("/portfolioP2")
    public String portfolioP2(){
        return "/html/portfolioP2";
    }
    @GetMapping("/portfolioP3")
    public String portfolioP3(){
        return "/html/portfolioP3";
    }
    @GetMapping("/portfolioP4")
    public String portfolioP4(){
        return "/html/portfolioP4";
    }
    @GetMapping("/portfolioP5")
    public String portfolioP5(){
        return "/html/portfolioP5";
    }
    @GetMapping("/portfolioP6")
    public String portfolioP6(){
        return "/html/portfolioP6";
    }
    @GetMapping("/portfolioP7")
    public String portfolioP7(){
        return "/html/portfolioP7";
    }


}
