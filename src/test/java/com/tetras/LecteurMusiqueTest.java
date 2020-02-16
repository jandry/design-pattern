package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LecteurMusiqueTest {

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
    public void testLecture() {
        Morceau cannonball = new Morceau("cannonball");
        Morceau loser = new Morceau("loser");
        Morceau walkOnTheWildSide = new Morceau("walk on wild side");
        //
        LecteurMusique lecteur = new LecteurMusique();
        lecteur.lire(cannonball);
        lecteur.lire(loser);
        lecteur.lire(walkOnTheWildSide);
        lecteur.lireMorceauPrecedent();
        //
        assertNotNull(outContent);
        String[] result = outContent.toString().split("\\n");
        assertEquals(4, result.length);
        assertEquals("cannonball", result[0]);
        assertEquals("loser", result[1]);
        assertEquals("walk on wild side", result[2]);
        assertEquals("loser", result[3]);
    }
}