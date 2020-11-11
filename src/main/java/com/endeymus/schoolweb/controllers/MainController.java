package com.endeymus.schoolweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/registration")
    public String regis(){
        return "registration";
    }

    @GetMapping("/")
    public String main(){
        return "signin";
    }

}
