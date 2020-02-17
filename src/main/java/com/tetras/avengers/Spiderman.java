package com.tetras.avengers;

import com.tetras.Personnage;

public class Spiderman implements Avengers {

    @Override
    public boolean gagneCombatContre(Personnage personnage) {
        return false;
    }

}