package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class LecteurMusique {

    List<MementoMorceau> historiqueMorceau = new ArrayList<>();

    public String lire(Morceau morceau) {
        historiqueMorceau.add(morceau.creerMemento());
        return morceau.getNom();
    }

    public String lireMorceauPrecedent() {
        String result = "";
        if (historiqueMorceau.size() >= 2) {
            MementoMorceau memento = historiqueMorceau.get(historiqueMorceau.size() - 2);
            Morceau morceau = new Morceau(memento);
            result = morceau.getNom();
        }
        return result;
    }

}