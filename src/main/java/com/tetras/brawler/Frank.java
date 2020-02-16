package com.tetras.brawler;

import com.tetras.power.Eponge;
import com.tetras.power.TourDeForce;

public class Frank implements Brawler {

    public void activerEponge() {
        new Eponge().activer();
    }

    public void activerTourDeForce() {
        new TourDeForce().activer();
    }

}