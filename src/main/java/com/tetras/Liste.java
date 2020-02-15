package com.tetras;

public class Liste extends ElementTexte {

    public Liste(String texte) {
        super(texte);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}