package com.example.services;

import com.javabasedconfig.textgenerator.TextGenerator;
import org.springframework.stereotype.Service;

@Service
public class JavaConfiguredServiceImpl implements DummyTextService {

    // This bean is configured via Java Configuration
    private final TextGenerator textGenerator;

    public JavaConfiguredServiceImpl(TextGenerator textGenerator) {
        this.textGenerator = textGenerator;
    }

    @Override
    public String getSomeDummyText() {
        return textGenerator.getSomeText();
    }
}
