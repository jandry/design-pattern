package com.tetras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Serie implements Iterable<Episode>, Iterator<Episode> {

    @Override
    public Iterator<Episode> iterator() {
        return new IteratorEpisode(listeEpisode);
    }

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

}