package com.tetras;

import java.text.MessageFormat;

public class Titre extends ElementTexte {

    public Titre(String texte) {
        super(texte);
    }

    @Override
    public String getHtml() {
        return MessageFormat.format("<h1>{0}</h1>", getTexte());
    }
}