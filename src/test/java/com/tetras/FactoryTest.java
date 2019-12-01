package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.holo.HoloFactory;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void testHolo() {
        HoloFactory factory = new HoloFactory();
        assertEquals("HoloButton clicked", factory.createHoloButton().click());
        assertEquals("HoloLabel shown", factory.createHoloLabel().show());
        assertEquals("HoloDatePicker selected", factory.createHoloDatePicker().select());
    }
}