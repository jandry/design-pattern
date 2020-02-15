package com.tetras;

public abstract class ElementTexte {

    private String texte;

    public ElementTexte(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public abstract String getHtml();

}