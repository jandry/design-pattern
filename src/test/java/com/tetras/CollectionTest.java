package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CollectionTest {

    @Test
    public void testCollection() {
        Serie starwars = new Serie("La Guerre des Etoiles");
        Episode episode1 = new Episode("La menace fantôme");
        starwars.ajouter(episode1);
        Episode episode2 = new Episode("L'attaque des clones");
        starwars.ajouter(episode2);
        assertEquals("La Guerre des Etoiles", starwars.toString());
    }
}