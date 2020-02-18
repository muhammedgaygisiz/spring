package com.example.controllers;

import com.example.services.DummyTextService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class JavaConfiguredController {

    private DummyTextService service;

    public JavaConfiguredController(@Qualifier("javaConfiguredServiceImpl") DummyTextService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getSomeDummyText();
    }
}
