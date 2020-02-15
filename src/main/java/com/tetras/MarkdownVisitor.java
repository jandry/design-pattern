package com.tetras;

import java.text.MessageFormat;

public class MarkdownVisitor implements Visitor {

    @Override
    public void visit(Gras element) {
        System.out.println(MessageFormat.format("__{0}__", element.getTexte()));
    }

    @Override
    public void visit(Titre element) {
        System.out.println(MessageFormat.format("# {0}", element.getTexte()));
    }

    @Override
    public void visit(Liste element) {
        System.out.println(MessageFormat.format("* {0}", element.getTexte()));
    }

    @Override
    public void visit(Visitable element) {
        throw new UnsupportedOperationException("Not implemented");
    }

}