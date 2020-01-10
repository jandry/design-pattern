package com.tetras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryTest {

    private void assertExecutor(MaitreJedi executor) {

        executor.mediter();
        executor.combattre();
    }

    @Test
    public void testYoda() {
        MaitreJedi executor = MaitreJediFactory.getMaitreJedi(MaitreType.yoda);
        assertTrue(executor instanceof Yoda);
        assertExecutor(executor);
    }

    @Test
    public void testLuke() {
        MaitreJedi executor = MaitreJediFactory.getMaitreJedi(MaitreType.lukeSkywalker);
        assertTrue(executor instanceof LukeSkywalker);
        assertExecutor(executor);
    }

}