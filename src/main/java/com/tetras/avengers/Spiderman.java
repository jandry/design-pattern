package com.tetras.avengers;

import com.tetras.BadGuy;

public class Spiderman implements Avengers {

    @Override
    public boolean gagneCombatContre(BadGuy personnage) {
        return false;
    }

}