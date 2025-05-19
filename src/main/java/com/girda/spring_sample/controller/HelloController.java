package com.girda.spring_sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Rota /hello acessada");
        System.out.println("Debug para diagnóstico");
        return "Olá, mundo!";
    }
}
