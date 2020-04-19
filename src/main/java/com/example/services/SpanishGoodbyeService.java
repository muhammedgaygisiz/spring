package com.example.services;

public class SpanishGoodbyeService implements GoodbyeService {
    public SpanishGoodbyeService(GoodbyeRepository goodbyeRepository) {
    }

    @Override
    public String getSomeDummyTest() {
        return "Ay yay yay";
    }
}
