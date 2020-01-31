package com.tetras.application;

import com.tetras.librarie.Canard;

public class CanardToTriathleteAdapter implements Triathlete {

    private Canard canard = new Canard();

    @Override
    public void faireUnTriathlon() {
        canard.nager(1500);
        canard.voler(40000);
        canard.marcher(10000);
    }

    public int getDistanceParcourueEnMetre() {
        return canard.getDistanceParcourueEnMetre();
    }
}