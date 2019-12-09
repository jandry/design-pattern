package com.tetras.librairie;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class ServiceInfoEleveTest {

    @Test
    public void testGetInformationEleve() {
        //
        assertTimeout(Duration.ofSeconds(1), () -> {
            assertNotNull(new ServiceInfoEleve().getInformationEleve(1));
        });
    }
}