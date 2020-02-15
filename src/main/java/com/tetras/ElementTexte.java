package com.tetras;

public abstract class ElementTexte implements Visitable {

    private String texte;

    public ElementTexte(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

}