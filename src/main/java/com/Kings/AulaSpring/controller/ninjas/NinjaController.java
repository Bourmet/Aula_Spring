package com.Kings.AulaSpring.controller.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
@RestController é a fusao de:
@Controller - retorna paginas HTML
@ResponseBody -
 */
@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/vamos")
    public String helloWorld(){
        return "Heloo World!";
    }
}
