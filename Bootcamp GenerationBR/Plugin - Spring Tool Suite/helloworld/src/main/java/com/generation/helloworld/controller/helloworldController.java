package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotation = Anotação
@RestController // indica para o spring que o código é da classe controladora
@RequestMapping("/hello") // notação que indica endpoint - executa uma funçao de cada vez GPPD 
public class helloworldController {

    @GetMapping
    public String helloworldController() {
        return "Hello World!!!";
    }

}
