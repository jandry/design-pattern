package com.tetras;

import java.util.Stack;

public class LecteurMusique {

    Stack<MementoMorceau> stack = new Stack<>();

    public String lire(Morceau morceau) {
        stack.add(morceau.creerMemento());
        return morceau.getNom();
    }

    public String lireMorceauPrecedent() {
        String result = null;
        if (!stack.isEmpty()) {
            MementoMorceau memento = stack.pop();
            if (!stack.isEmpty()) {
                memento = stack.peek();
                Morceau morceau = new Morceau(memento);
                result = morceau.getNom();
            }
        }
        return result;
    }

}