package com.tetras;

import java.util.Random;

public class Arbitre implements Observer<FaitJeu> {

    public void analyser(final FaitJeu fait) {
        final Random random = new Random();
        if (random.nextBoolean()) {
            System.err.println("faute");
        } else {
            System.err.println("jouer");
        }
    }

    @Override
    public void notify(FaitJeu fait) {
    }
}