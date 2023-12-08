package com.md.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/api/md")
    public String getMessage(){
        return "welcome to MD";
    }
}
