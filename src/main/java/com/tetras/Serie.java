package com.tetras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Serie implements Iterator<Episode> {

    private String nom;

    private List<Episode> listeEpisode = new ArrayList<>();

    private Iterator<Episode> iterator;

    public Serie(String nom) {
        this.nom = nom;
    }

    public void ajouter(Episode episode) {
        listeEpisode.add(episode);
    }

    public String getNom() {
        return nom;
    }

    public String toString() {
        return getNom();
    }

    @Override
    public boolean hasNext() {
        if (iterator == null)
            iterator = listeEpisode.iterator();
        return iterator.hasNext();
    }

    @Override
    public Episode next() {
        return iterator.next();
    }

    public void resetIterator() {
        iterator = listeEpisode.iterator();
    }
}