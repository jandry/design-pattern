package com.tetras;

import java.text.MessageFormat;

public class Liste extends ElementTexte {

    public Liste(String texte) {
        super(texte);
    }

    @Override
    public String getHtml() {
        return MessageFormat.format("<li>{0}</li>", getTexte());
    }
}