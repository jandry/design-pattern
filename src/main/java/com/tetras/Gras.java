package com.tetras;

public class Gras extends ElementTexte {

    public Gras(String texte) {
        super(texte);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}