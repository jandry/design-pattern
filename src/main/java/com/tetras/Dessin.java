package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class Dessin implements Forme {

    private List<Forme> formes = new ArrayList<>();

    public void ajouter(Forme forme) {
        formes.add(forme);
    }

    public void dessiner() {
        formes.stream().forEach(t -> t.dessiner());
        System.out.println("Dessin dessiné");
    }
}