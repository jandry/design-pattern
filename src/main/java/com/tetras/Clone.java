package com.tetras;

import java.nio.charset.Charset;
import java.util.Random;

public class Clone implements Cloneable{
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Clone() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);
        nom = new String(array, Charset.forName("UTF-8"));
        System.out.println("Clone: " +getNom());

    }

    public boolean equals(Object objectToCompare) {
        if (objectToCompare==null)
            return false;
        if (!this.getClass().getName().equals(objectToCompare.getClass().getName())) {
            return false;
        }
        Clone cloneToCompare = (Clone) objectToCompare;
        if (this.getNom()==null) {
            return (cloneToCompare.getNom() ==null);
        }
        return (this.getNom().equals(cloneToCompare.getNom()));
    }
}