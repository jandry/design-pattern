package com.tetras.librairie;

public class Eleve {

    private int id;
    private String nom;
    private String prenom;

    public Eleve() {
    }

    public Eleve(int i) {
        this.id = i;
        this.nom = "nom-" + i;
        this.prenom = "prenom-" + i;
    }

    public Eleve(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}