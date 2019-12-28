package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TonyStarkTest {

    @Test
    public void testCapacites() {
        TonyStark tony = new TonyStark();
        assertEquals("50cm", tony.sauter());
        assertEquals("7m/s", tony.courir());
    }
}