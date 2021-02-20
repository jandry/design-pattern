package com.tetras;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

public class Arbitre implements PropertyChangeListener {

    public void analyser(final FaitJeu fait) {
        final Random random = new Random();
        if (random.nextBoolean()) {
            System.err.println("faute");
        } else {
            System.err.println("jouer");
        }
    }

    public void propertyChange(PropertyChangeEvent evt) {
        analyser((FaitJeu) evt.getNewValue());
    }
}