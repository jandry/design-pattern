package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.avengers.Ironman;
import com.tetras.avengers.Spiderman;
import com.tetras.avengers.Thor;

import org.junit.jupiter.api.Test;

public class ThanosTest {

    @Test
    public void testPierreInfinite() {
        Thanos thanos = new Thanos();
        Temple temple = new Temple();
        temple.ajouterProtecteur(new Spiderman());
        temple.ajouterProtecteur(new Thor());
        temple.ajouterProtecteur(new Ironman());
        //
        thanos.recupererPierreInfinite(temple);
        //
        assertEquals(0, thanos.compterPierreGant());
    }
}