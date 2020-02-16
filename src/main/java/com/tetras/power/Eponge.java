package com.tetras.power;

public class Eponge implements StarPowerStrategy {

    @Override
    public void activer() {
        System.out.println("obtient + 1000 PV max.");
    }

}