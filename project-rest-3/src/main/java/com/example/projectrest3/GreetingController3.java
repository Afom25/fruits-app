package com.example.projectrest3;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController3 {

    @RequestMapping(value ="/greeting")
    public String greeting (@RequestParam String name ){
        return "Hello  " + name;
    }
}
