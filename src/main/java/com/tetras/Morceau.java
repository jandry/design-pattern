package com.tetras;

public class Morceau {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Morceau(String nom) {
        this.nom = nom;
    }

    public Morceau(MementoMorceau memento) {
        restaurerMemento(memento);
    }

    public MementoMorceau creerMemento() {
        return new MementoMorceau(getNom());
    }

    public void restaurerMemento(MementoMorceau memento) {
        setNom(memento.getNom());
    }

}