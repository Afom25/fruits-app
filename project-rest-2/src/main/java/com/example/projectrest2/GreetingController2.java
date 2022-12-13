package com.example.projectrest2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController2 {
    @RequestMapping(value = "/greeting")
    public String greetingJSON(){
        return "Hello world ";
    }
}
