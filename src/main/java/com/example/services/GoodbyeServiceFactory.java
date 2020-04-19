package com.example.services;

public class GoodbyeServiceFactory {

    private GoodbyeRepository goodbyeRepository;

    public GoodbyeServiceFactory(GoodbyeRepository goodbyeRepository) {
        this.goodbyeRepository = goodbyeRepository;
    }

    public GoodbyeService createGoodbyeService(String lang) {
        switch (lang) {
            case "de":
                return new GermanGoodbyeService(goodbyeRepository);
            case "es":
                return new SpanishGoodbyeService(goodbyeRepository);
            case "en":
            default:
                return new EnglishGoodbyeService(goodbyeRepository);
        }
    }
}
