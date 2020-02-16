package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.tetras.brawler.Frank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BrawlerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testStarPower() {
        Frank brawler = new Frank();
        brawler.activerEponge();
        brawler.activerTourDeForce();

        assertNotNull(outContent);
        String[] result = outContent.toString().split("\\n");
        assertEquals(2, result.length);
        assertEquals("obtient + 1000 PV max.", result[0]);
        assertEquals(
                "Les Brawlers tombés au combat laissent des squelettes violets derrière eux. Seul frank peut les voir, et en attraper un lui donne +30% de dégâts durant 10 secondes.",
                result[1]);
    }
}