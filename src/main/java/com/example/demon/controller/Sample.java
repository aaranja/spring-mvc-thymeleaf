package com.example.demon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample {
    @GetMapping("/sample")
    public String showForm() {
        System.out.println("hola");
        return "sample";
    }

}