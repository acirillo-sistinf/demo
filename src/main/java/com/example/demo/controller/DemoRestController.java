package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Value("${user.msg}")
    private String userMessage;

    @GetMapping(value = "/hello")
    public String getHello(){
        return "[ "+userMessage +" ]";
    }

    @RequestMapping(value = "/super-heroes", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
    public String getSupeHero() {
        return "{ name: batman, power: black}";
    }


}
