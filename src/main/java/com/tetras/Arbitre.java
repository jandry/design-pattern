package com.tetras;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

@SuppressWarnings("deprecation")
public class Arbitre implements Observer {

    public void analyser(final FaitJeu fait) {
        final Random random = new Random();
        if (random.nextBoolean()) {
            System.err.println("faute");
        } else {
            System.err.println("jouer");
        }
    }

    @Override
    public void update(Observable o, Object fait) {
        analyser((FaitJeu) fait);

    }

}