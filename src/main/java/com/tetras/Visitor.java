package com.tetras;

public interface Visitor {

    void visit(Visitable element);

    void visit(Gras element);

    void visit(Titre element);

    void visit(Liste element);

}