package com.example.services;

public class GermanGoodbyeService implements GoodbyeService {
    public GermanGoodbyeService(GoodbyeRepository goodbyeRepository) {
    }

    @Override
    public String getSomeDummyTest() {
        return "Tschö mit ö";
    }
}
