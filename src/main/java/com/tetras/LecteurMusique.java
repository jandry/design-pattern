package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class LecteurMusique {

    List<MementoMorceau> historiqueMorceau = new ArrayList<>();

    public void lire(Morceau morceau) {
        System.out.println(morceau.getNom());
        historiqueMorceau.add(morceau.creerMemento());
    }

    public void lireMorceauPrecedent() {
        if (historiqueMorceau.size() >= 2) {
            MementoMorceau memento = historiqueMorceau.get(historiqueMorceau.size() - 2);
            Morceau morceau = new Morceau(memento);
            System.out.println(morceau.getNom());
        }
    }

}