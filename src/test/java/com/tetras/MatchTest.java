package com.tetras;

import org.junit.jupiter.api.Test;

public class MatchTest {

    @Test
    public void testMatch() {
        Match match = new Match();
        Arbitre arbitre1 = new Arbitre();
        Arbitre arbitre2 = new Arbitre();
        Arbitre arbitre3 = new Arbitre();
        Arbitre arbitre4 = new Arbitre();
        FaitJeu fait = match.genererFait();
        arbitre1.analyser(fait);
        arbitre2.analyser(fait);
        arbitre3.analyser(fait);
        arbitre4.analyser(fait);
    }
}