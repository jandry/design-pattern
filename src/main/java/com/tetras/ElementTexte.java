package com.tetras;

public class ElementTexte implements Visitable {

    private String texte;

    public ElementTexte(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}