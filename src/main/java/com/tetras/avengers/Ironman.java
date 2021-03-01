package com.tetras.avengers;

import com.tetras.BlackDwarf;
import com.tetras.BadGuy;

public class Ironman implements Avengers {

    @Override
    public boolean gagneCombatContre(BadGuy personnage) {
        return (personnage instanceof BlackDwarf);
    }

}