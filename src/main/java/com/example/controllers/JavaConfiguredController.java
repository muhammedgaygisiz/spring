package com.example.controllers;

import com.example.services.JavaConfiguredService;
import org.springframework.stereotype.Controller;

@Controller
public class JavaConfiguredController {

    private JavaConfiguredService service;

    public JavaConfiguredController(JavaConfiguredService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getSomeDummyText();
    }
}
