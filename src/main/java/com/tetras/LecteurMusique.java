package com.tetras;

public class LecteurMusique {

    public String lire(Morceau morceau) {
        return morceau.getNom();
    }

    public String lireMorceauPrecedent() {
        return "";
    }

}