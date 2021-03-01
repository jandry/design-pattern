package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepasTest {

    @Test
    public void testRepas() {
        Maman marge = new Maman();

        Ado bart = new Ado();
        assertEquals("J'arriveuh !", marge.appelerATable(bart));

        Enfant maggie = new Enfant();
        assertEquals("Je rampe", marge.appelerATable(maggie));
    }
}