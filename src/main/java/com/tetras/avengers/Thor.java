package com.tetras.avengers;

import com.tetras.BadGuy;

public class Thor implements Avengers {

    @Override
    public boolean gagneCombatContre(BadGuy personnage) {
        return false;
    }

}