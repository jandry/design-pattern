package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementTexteTest {

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

    private List<ElementTexte> initTextCase() {
        List<ElementTexte> texte = new ArrayList<>();
        texte.add(new Titre("Mon titre"));
        texte.add(new Liste("Mon element de liste"));
        texte.add(new Gras("Mon texte gras"));
        return texte;
    }

    @Test
    public void testHtmlTexte() {
        List<ElementTexte> texte = initTextCase();

        HtmlVisitor htmlVisitor = new HtmlVisitor();

        texte.stream().forEach(t -> t.accept(htmlVisitor));

        assertNotNull(outContent);
        String[] result = outContent.toString().split("\\n");
        assertEquals(3, result.length);
        assertEquals("<h1>Mon titre</h1>", result[0]);
        assertEquals("<ul>Mon element de liste</ul>", result[1]);
        assertEquals("<b>Mon texte gras</b>", result[2]);
    }

    @Test
    public void testMarkdownTexte() {
        List<ElementTexte> texte = initTextCase();

        MarkdownVisitor htmlVisitor = new MarkdownVisitor();

        texte.stream().forEach(t -> t.accept(htmlVisitor));

        assertNotNull(outContent);
        String[] result = outContent.toString().split("\\n");
        assertEquals(3, result.length);
        assertEquals("# Mon titre", result[0]);
        assertEquals("* Mon element de liste", result[1]);
        assertEquals("__Mon texte gras__", result[2]);
    }
}