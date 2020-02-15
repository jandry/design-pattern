package com.tetras;

import java.text.MessageFormat;

public class Gras extends ElementTexte {

    public Gras(String texte) {
        super(texte);
    }

    @Override
    public String getHtml() {
        return MessageFormat.format("<b>{0}</b>", getTexte());
    }

}