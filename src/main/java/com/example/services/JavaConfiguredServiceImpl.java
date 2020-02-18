package com.example.services;

import com.javabasedconfig.textgenerator.JavaBasedTextGenerator;
import org.springframework.stereotype.Service;

@Service
public class JavaConfiguredServiceImpl implements DummyTextService {

    // This bean is configured via Java Configuration
    private final JavaBasedTextGenerator textGenerator;

    public JavaConfiguredServiceImpl(JavaBasedTextGenerator javaBasedTextGenerator) {
        this.textGenerator = javaBasedTextGenerator;
    }

    @Override
    public String getSomeDummyText() {
        return textGenerator.getSomeText();
    }
}
