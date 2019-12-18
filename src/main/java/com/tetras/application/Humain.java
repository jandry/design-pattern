package com.tetras.application;

public class Humain implements Triathlete {
    private int distanceEnMetre;

    public void nager(int distanceEnMetre) {
        this.distanceEnMetre += distanceEnMetre;
    }

    public void faireDuVelo(int distanceEnMetre) {
        this.distanceEnMetre += distanceEnMetre;
    }

    public void courrir(int distanceEnMetre) {
        this.distanceEnMetre += distanceEnMetre;
    }

    public int getDistanceParcourueEnMetre() {
        return distanceEnMetre;
    }

    @Override
    public void faireUnTriathlon() {
        nager(1500);
        faireDuVelo(40000);
        courrir(10000);
    }
}