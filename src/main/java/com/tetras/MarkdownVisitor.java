package com.tetras;

public class MarkdownVisitor implements Visitor {

    @Override
    public void visit(Gras element) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void visit(Titre element) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void visit(Liste element) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void visit(Visitable element) {
        throw new UnsupportedOperationException("Not implemented");
    }

}