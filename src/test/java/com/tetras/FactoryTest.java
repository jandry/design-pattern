package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.holo.HoloFactory;
import com.tetras.material.MaterialFactory;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void testHolo() {
        HoloFactory factory = new HoloFactory();
        assertEquals("HoloButton clicked", factory.createHoloButton().click());
        assertEquals("HoloLabel shown", factory.createHoloLabel().show());
        assertEquals("HoloDatePicker selected", factory.createHoloDatePicker().select());
    }

    @Test
    public void testMaterial() {
        MaterialFactory factory = new MaterialFactory();
        assertEquals("MaterialButton clicked", factory.createMaterialButton().click());
        assertEquals("MaterialLabel shown", factory.createMaterialLabel().show());
        assertEquals("MaterialDatePicker selected", factory.createMaterialDatePicker().select());
    }
}