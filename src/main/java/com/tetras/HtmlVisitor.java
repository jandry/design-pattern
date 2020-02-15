package com.tetras;

import java.text.MessageFormat;

public class HtmlVisitor implements Visitor {

    public String getHtml(ElementTexte element, String tag) {
        return MessageFormat.format("<{0}>{1}</{0}>", tag, element.getTexte());
    }

    @Override
    public void visit(Gras element) {
        System.out.println(getHtml(element, "b"));
    }

    @Override
    public void visit(Titre element) {
        System.out.println(getHtml(element, "h1"));
    }

    @Override
    public void visit(Liste element) {
        System.out.println(getHtml(element, "ul"));
    }

    @Override
    public void visit(Visitable element) {
        throw new UnsupportedOperationException("Not implemented");
    }

}