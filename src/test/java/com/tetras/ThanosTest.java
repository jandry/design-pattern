package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThanosTest {

    @Test
    public void testPierreInfinite() {
        Thanos thanos = new Thanos();
        Temple temple = new Temple();
        //
        thanos.recupererPierreInfinite(temple);
        //
        assertEquals(1, thanos.compterPierreGant());
    }
}