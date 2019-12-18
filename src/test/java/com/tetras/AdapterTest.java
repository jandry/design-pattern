package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.application.Triathlete;
import com.tetras.application.Humain;

import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    public void testFaireTriathlon() {
        Triathlete athlete = new Humain();
        athlete.faireUnTriathlon();
        assertEquals(51500, athlete.getDistanceParcourueEnMetre());
    }
}