package com.tetras;

public class Titre extends ElementTexte {

    public Titre(String texte) {
        super(texte);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}