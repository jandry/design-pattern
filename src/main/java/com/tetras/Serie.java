package com.tetras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Serie implements Iterable<Episode>, Iterator<Episode> {

    private String nom;

    private List<Episode> listeEpisode = new ArrayList<>();

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

    private int indexIterator = -1;

    @Override
    public boolean hasNext() {
        return (indexIterator + 1 < listeEpisode.size());
    }

    @Override
    public Episode next() {
        if (hasNext()) {
            indexIterator++;
        }
        return listeEpisode.get(indexIterator);
    }

    @Override
    public Iterator<Episode> iterator() {
        return null;
    }

}