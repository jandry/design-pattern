package com.tetras;

public class Clone {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean equals(Object objectToCompare) {
        if (objectToCompare == null)
            return false;
        if (!this.getClass().getName().equals(objectToCompare.getClass().getName())) {
            return false;
        }
        Clone cloneToCompare = (Clone) objectToCompare;
        if (this.getNom() == null) {
            return (cloneToCompare.getNom() == null);
        }
        return (this.getNom().equals(cloneToCompare.getNom()));
    }
}