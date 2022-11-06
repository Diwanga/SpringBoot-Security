package com.security.sbsecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String helloApp(){
        return "Hello";
    }

    @GetMapping("/h")
    public String helloApp2(){
        return "Hellov2222222";
    }
}
