package com.example.controllers;

import com.example.services.DummyTextService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class XmlConfiguredController {
    private DummyTextService service;

    public XmlConfiguredController(@Qualifier("xmlConfiguredServiceImpl") DummyTextService service) {
        this.service = service;
    }

    public String getGreeting() {
        return service.getSomeDummyText();
    }
}
