package com.firstspringbootapp.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/demo1")
    public String getDemo1() {
        System.out.println("This is our first demo API - printing in console");
        return "This is our first demo API - returning to user";
    }

    @GetMapping("/demo2")
    public String getDemo2() {
        System.out.println("This is our second demo API - printing in console");
        return "This is our second demo API - returning to user";
    }
}
