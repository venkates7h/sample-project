package com.helloworld.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @GetMapping("hello")
    public String helloWorld(){
        return "hello I am from spring boot";
    }
}
