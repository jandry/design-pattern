package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RepasTest {

    @Test
    public void testRepas() {
        assertEquals("J'arrive", new Maman().appelerATable());
    }
}