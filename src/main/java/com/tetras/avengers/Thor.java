package com.tetras.avengers;

import com.tetras.Personnage;

public class Thor implements Avengers {

    @Override
    public boolean gagneCombatContre(Personnage personnage) {
        return false;
    }

}