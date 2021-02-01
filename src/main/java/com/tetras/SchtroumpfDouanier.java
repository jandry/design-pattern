package com.tetras;

public class SchtroumpfDouanier extends Schtroumpf {
    public String saluer(Animal animal) {
        if (animal instanceof AnimalDangereux)
                return "Au revoir " + animal.getNom();
            else 
            return super.saluer(animal);
    }
}