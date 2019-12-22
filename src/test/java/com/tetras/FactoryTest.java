package com.tetras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void testYoda() {
        Yoda executor = new Yoda();
        assertTrue(executor instanceof Yoda);
        executor.mediter();
        executor.combattre();
    }

    @Test
    public void testLukeSkywalker() {
        LukeSkywalker executor = new LukeSkywalker();
        assertTrue(executor instanceof LukeSkywalker);
        executor.mediter();
        executor.combattre();
    }
}