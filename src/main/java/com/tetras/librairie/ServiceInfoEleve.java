package com.tetras.librairie;

public class ServiceInfoEleve {

    public Eleve getInformationEleve(int id) {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Eleve(id);
    }
}