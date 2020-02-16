package com.tetras;

import org.junit.jupiter.api.Test;

public class LecteurMusiqueTest {

    @Test
    public void testLecture() {
        Morceau cannonball = new Morceau("cannonball");
        Morceau loser = new Morceau("loser");

        LecteurMusique lecteur = new LecteurMusique();
        lecteur.lire(cannonball);
        lecteur.lire(loser);
    }
}