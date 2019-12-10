package com.tetras.application;

public class Application {

    public void start() {
        ServiceInfoEleveCache service = new ServiceInfoEleveCache();
        System.out.println("Nom eleve 1 " + service.getInformationEleve(1).getNom());
        System.out.println("Nom eleve 2 " + service.getInformationEleve(2).getNom());
        System.out.println("Nom eleve 3 " + service.getInformationEleve(3).getNom());
        System.out.println("Prenom eleve 1 " + service.getInformationEleve(1).getPrenom());
        System.out.println("Prenom eleve 2 " + service.getInformationEleve(2).getPrenom());
        System.out.println("Prenom eleve 3 " + service.getInformationEleve(3).getPrenom());
    }
}