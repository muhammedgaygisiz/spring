package com.example.controllers;

import com.example.services.GoodbyeService;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryConfiguredController {

    private final GoodbyeService service;

    public FactoryConfiguredController(GoodbyeService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getSomeDummyTest();
    }
}
