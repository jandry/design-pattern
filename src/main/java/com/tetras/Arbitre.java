package com.tetras;

import java.util.Random;

public class Arbitre {

    public void analyser(FaitJeu fait) {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.err.println("faute");
        } else {
            System.err.println("jouer");
        }
    }
}