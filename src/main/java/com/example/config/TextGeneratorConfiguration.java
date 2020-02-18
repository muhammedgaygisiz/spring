package com.example.config;

import com.javabasedconfig.textgenerator.TextGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextGeneratorConfiguration {

    @Bean
    public TextGenerator textGenerator() {
        return new TextGenerator();
    }
}
