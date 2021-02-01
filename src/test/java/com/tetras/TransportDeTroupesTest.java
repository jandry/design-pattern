package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TransportDeTroupesTest {

    @Test
    public void testCloneDroid() {
        TransportDeTroupes transportDeTroupes = new TransportDeTroupes();
        Clone clone1 = transportDeTroupes.sortirClone();
        Clone clone2 = transportDeTroupes.sortirClone();
        //
        assertTrue(clone1 != clone2);
        assertEquals(clone1.getClass(), clone2.getClass());
        assertTrue(clone1.equals(clone2));
    }
    
}