package com.tetras;

public class ATableCommande {

    public String executer(Object personne) {
        if (personne instanceof Enfant) {
            return ((Enfant) personne).venirATableAQuatrePatte();
        } else if (personne instanceof Ado) {
            return ((Ado) personne).venirATableEnRalant();
        } else {
            throw new IllegalArgumentException();
        }
    }
}