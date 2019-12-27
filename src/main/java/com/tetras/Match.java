package com.tetras;

import java.util.Observable;

public class Match extends Observable {

    public FaitJeu genererFait() {
        FaitJeu fait = new FaitJeu();
        setChanged();
        notifyObservers(fait);
        return fait;
    }

}