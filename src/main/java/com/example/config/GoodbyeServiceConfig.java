package com.example.config;

import com.example.services.GoodbyeRepository;
import com.example.services.GoodbyeService;
import com.example.services.GoodbyeServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GoodbyeServiceConfig {

    @Bean
    GoodbyeServiceFactory goodbyeServiceFactory(GoodbyeRepository goodbyeRepository) {
        return new GoodbyeServiceFactory(goodbyeRepository);
    }

    @Bean
    @Primary
    @Profile({"default", "EN"})
    GoodbyeService primaryGoodbyeService(GoodbyeServiceFactory goodbyeServiceFactory) {
        return goodbyeServiceFactory.createGoodbyeService("en");
    }

    @Bean
    @Primary
    @Profile({"ES"})
    GoodbyeService primarySpanishGoodbyeService(GoodbyeServiceFactory goodbyeServiceFactory) {
        return goodbyeServiceFactory.createGoodbyeService("es");
    }

    @Bean
    @Primary
    @Profile({"DE"})
    GoodbyeService primaryGermanGoodbyeService(GoodbyeServiceFactory goodbyeServiceFactory) {
        return goodbyeServiceFactory.createGoodbyeService("de");
    }
}
