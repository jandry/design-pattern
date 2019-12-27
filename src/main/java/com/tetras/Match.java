package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class Match {

    List<Observer<FaitJeu>> listeObserver = new ArrayList<>();

    public FaitJeu genererFait() {
        return new FaitJeu();
    }

    public void register(Observer<FaitJeu> observer) {
    }
}