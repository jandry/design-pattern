package com.tetras.avengers;

import com.tetras.Personnage;

public class Ironman implements Avengers {

    @Override
    public boolean gagneCombatContre(Personnage personnage) {
        return true;
    }

}