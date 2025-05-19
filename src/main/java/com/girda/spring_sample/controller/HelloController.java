package com.girda.spring_sample.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LogManager.getLogger(HelloController.class);
    
    @GetMapping("/hello")
    public String hello() {
        logger.info("Rota /hello acessada");
        logger.debug("Debug para diagnóstico");
        return "Olá, mundo!";
    }
}
