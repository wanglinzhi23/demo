package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("helloWorld")
    public Object hello(){
        return "欢迎来到德莱联盟";
    }
}
