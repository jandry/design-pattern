package com.tetras.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.tetras.library.GestionMachineACafe;

import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void testDependencyInjection() {
        MachineACafe machine = new MachineACafe();
        GestionMachineACafe gestionnaire = new GestionMachineACafe();
        gestionnaire.setMachine(machine);
        Application appli = new Application();
        appli.setGestionnaire(gestionnaire);
        // Test
        assertNotNull(appli);
        assertNotNull(appli.getGestionnaire());
        assertNotNull(appli.getGestionnaire().getMachine());
    }
}