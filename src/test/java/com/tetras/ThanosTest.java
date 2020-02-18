package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.avengers.Ironman;
import com.tetras.avengers.Spiderman;
import com.tetras.avengers.Thor;

import org.junit.jupiter.api.Test;

public class ThanosTest {

    @Test
    public void testPierreInfinite() {

        Temple temple = new Temple();
        temple.ajouterProtecteur(new Spiderman());
        temple.ajouterProtecteur(new Thor());
        temple.ajouterProtecteur(new Ironman());
        //
        BlackDwarf blackDwarf = new BlackDwarf();
        blackDwarf.recupererPierreInfinite(temple);
        //
        assertEquals(0, blackDwarf.compterPierreGant());
        //
        Thanos thanos = new Thanos();
        thanos.recupererPierreInfinite(temple);
        //
        assertEquals(1, thanos.compterPierreGant());
    }
}