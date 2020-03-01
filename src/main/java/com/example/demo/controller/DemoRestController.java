package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Value("${user.msg}")
    private String userMessage;

    @GetMapping(value = "/hello")
    public String getHello(){
        return "[ "+userMessage +" ]";
    }
}
