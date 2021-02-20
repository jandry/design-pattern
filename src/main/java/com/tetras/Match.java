package com.tetras;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Match extends Observable {

    public FaitJeu genererFait() {
        FaitJeu fait = new FaitJeu();
        return fait;
    }

}