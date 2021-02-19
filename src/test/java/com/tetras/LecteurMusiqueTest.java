package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class LecteurMusiqueTest {

    @Test
    public void testLecture() {
        Morceau cannonball = new Morceau("cannonball");
        Morceau loser = new Morceau("loser");
        Morceau walkOnTheWildSide = new Morceau("walk on wild side");
        //
        LecteurMusique lecteur = new LecteurMusique();
        assertEquals(cannonball.getNom(), lecteur.lire(cannonball));
        assertEquals(loser.getNom(), lecteur.lire(loser));
        assertEquals(walkOnTheWildSide.getNom(), lecteur.lire(walkOnTheWildSide));
        assertEquals(loser.getNom(), lecteur.lireMorceauPrecedent());
        assertEquals(cannonball.getNom(), lecteur.lireMorceauPrecedent());
        assertNull(lecteur.lireMorceauPrecedent());
    }
}