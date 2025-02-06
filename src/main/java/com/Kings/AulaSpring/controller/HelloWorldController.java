package com.Kings.AulaSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
@RestController é a fusao de:
@Controller - retorna paginas HTML
@ResponseBody -
 */
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Heloo World!";
    }
}
