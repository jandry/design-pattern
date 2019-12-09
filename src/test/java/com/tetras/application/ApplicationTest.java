package com.tetras.application;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test
    public void testRun() {
        //
        assertTimeout(Duration.ofSeconds(3), () -> {
            new Application().start();
        });

    }
}