package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class Match {

    List<Observer<FaitJeu>> listeObserver = new ArrayList<>();

    public FaitJeu genererFait() {
        FaitJeu fait = new FaitJeu();
        for (Observer<FaitJeu> observer : listeObserver) {
            observer.notify(fait);
        }
        return fait;
    }

    public void register(Observer<FaitJeu> observer) {
        listeObserver.add(observer);
    }
}