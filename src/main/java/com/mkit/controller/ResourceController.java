package com.mkit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/hiJinkin")
    public String m1(){

    System.out.println("Welcome to jenkins , jar is deployed to tomcat server");
    return "Hello Welcome to jenkins ";
    }
}
