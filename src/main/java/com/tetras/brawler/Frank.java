package com.tetras.brawler;

import com.tetras.power.StarPowerStrategy;

public class Frank implements Brawler {

    @Override
    public String activerStarPower(StarPowerStrategy starPower) {
        return starPower.activer();
    }

}