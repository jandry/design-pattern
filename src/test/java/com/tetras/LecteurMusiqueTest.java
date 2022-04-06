package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LecteurMusiqueTest {

    @Test
    public void testLecture() {
        Morceau cannonball = new Morceau("cannonball");
        Morceau looser = new Morceau("loser");
        Morceau walkOnTheWildSide = new Morceau("walk on wild side");
        //
        LecteurMusique lecteur = new LecteurMusique();
        assertEquals(cannonball.getNom(), lecteur.lire(cannonball));
        assertEquals(looser.getNom(), lecteur.lire(looser));
        assertEquals(walkOnTheWildSide.getNom(), lecteur.lire(walkOnTheWildSide));
    }
}