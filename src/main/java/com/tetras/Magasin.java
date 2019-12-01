package com.tetras;

public class Magasin {

    private static Magasin instance = new Magasin();

    private Magasin() {
    }

    public static Magasin getInstance() {
        return instance;
    }

}