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

        assertEquals("<h1>Mon titre</h1>", texte.get(0).getHtml());
        assertEquals("<li>Mon element de liste</li>", texte.get(1).getHtml());
        assertEquals("<b>Mon texte gras</b>", texte.get(2).getHtml());
    }
}