package com.tetras.librarie;

public class Canard {
    private int distanceEnMetre;

    public void nager(int distanceEnMetre) {
        this.distanceEnMetre += distanceEnMetre;
    }

    public void voler(int distanceEnMetre) {
        this.distanceEnMetre += distanceEnMetre;
    }

    public void marcher(int distanceEnMetre) {
        this.distanceEnMetre += distanceEnMetre;
    }

    public int getDistanceParcourueEnMetre() {
        return distanceEnMetre;
    }
}