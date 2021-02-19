package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class LecteurMusique {

    public String lire(Morceau morceau) {
        return morceau.getNom();
    }

    public String lireMorceauPrecedent() {
        return "";
    }

}