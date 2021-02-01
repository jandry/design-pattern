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
        System.out.println(getNom());

    }

    public boolean equals(Object objectToCompare) {
        if (objectToCompare==null)
            return false;
        if (!this.getClass().getName().equals(objectToCompare.getClass().getName())) {
            return false;
        }
        // TODO null check
        return (this.getNom().equals(((Clone) objectToCompare).getNom()));
    }

    public Clone clone() {
        Clone result = new Clone();
        result.setNom(this.getNom());
        return result;
    }
}