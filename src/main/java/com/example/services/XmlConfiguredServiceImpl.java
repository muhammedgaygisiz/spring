package com.example.services;

import com.xmlbasedconfig.textgenerator.XmlBasedTextGenerator;
import org.springframework.stereotype.Service;

@Service
public class XmlConfiguredServiceImpl implements DummyTextService {

    private final XmlBasedTextGenerator generator;

    public XmlConfiguredServiceImpl(XmlBasedTextGenerator generator) {
        this.generator = generator;
    }

    @Override
    public String getSomeDummyText() {
        return generator.getSomeText();
    }
}
