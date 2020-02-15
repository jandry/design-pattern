package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ElementTexteTest {

    @Test
    public void testElementTexte() {
        List<ElementTexte> texte = new ArrayList<>();
        texte.add(new Titre("Mon titre"));
        texte.add(new Liste("Mon element de liste"));
        texte.add(new Gras("Mon texte gras"));

        assertEquals("Mon titre", texte.get(0).getTexte());
        assertEquals("Mon element de liste", texte.get(1).getTexte());
        assertEquals("Mon texte gras", texte.get(2).getTexte());
    }
}