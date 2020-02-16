package com.tetras.brawler;

import com.tetras.power.StarPowerStrategy;

public class Frank implements Brawler {

    @Override
    public void activerStarPower(StarPowerStrategy starPower) {
        starPower.activer();
    }

}