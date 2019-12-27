package com.tetras;

public class Episode {

    private String nom;

    public Episode(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void lire() {
    }

    public String toString() {
        return getNom();
    }

}
