package com.tetras.power;

public class Eponge implements StarPowerStrategy {

    @Override
    public String activer() {
        return "obtient + 1000 PV max.";
    }

}