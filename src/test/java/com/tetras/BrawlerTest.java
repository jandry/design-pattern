package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tetras.brawler.Frank;

import org.junit.jupiter.api.Test;

public class BrawlerTest {

    @Test
    public void testStarPower() {
        Frank brawler = new Frank();
        assertEquals("obtient + 1000 PV max.", brawler.activerEponge());
        assertEquals(
                "Les Brawlers tombés au combat laissent des squelettes violets derrière eux. Seul frank peut les voir, et en attraper un lui donne +30% de dégâts durant 10 secondes.",
                brawler.activerTourDeForce());
    }
}