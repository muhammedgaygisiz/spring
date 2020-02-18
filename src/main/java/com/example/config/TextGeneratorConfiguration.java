package com.example.config;

import com.javabasedconfig.textgenerator.JavaBasedTextGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextGeneratorConfiguration {

    @Bean
    public JavaBasedTextGenerator textGenerator() {
        return new JavaBasedTextGenerator();
    }
}
