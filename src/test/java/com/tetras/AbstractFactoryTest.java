package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.generic.AbstractFactory;
import com.tetras.holo.HoloFactory;
import com.tetras.material.MaterialFactory;

import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    public void testHolo() {
        AbstractFactory factory = new HoloFactory();
        assertEquals("HoloButton clicked", factory.createButton().click());
        assertEquals("HoloLabel shown", factory.createLabel().show());
        assertEquals("HoloDatePicker selected", factory.createDatePicker().select());
    }

    @Test
    public void testMaterial() {
        AbstractFactory factory = new MaterialFactory();
        assertEquals("MaterialButton clicked", factory.createButton().click());
        assertEquals("MaterialLabel shown", factory.createLabel().show());
        assertEquals("MaterialDatePicker selected", factory.createDatePicker().select());
    }
}