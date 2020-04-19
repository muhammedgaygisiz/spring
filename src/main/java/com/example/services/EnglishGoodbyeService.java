package com.example.services;

public class EnglishGoodbyeService implements GoodbyeService {
    public EnglishGoodbyeService(GoodbyeRepository goodbyeRepository) {
    }

    @Override
    public String getSomeDummyTest() {
        return "Goodbye";
    }
}
