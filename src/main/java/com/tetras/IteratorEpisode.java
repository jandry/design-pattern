package com.tetras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEpisode implements Iterator<Episode> {

    private int indexIterator = -1;

    private List<Episode> listeEpisode = new ArrayList<>();

    public IteratorEpisode(List<Episode> listeEpisode) {
        this.listeEpisode = new ArrayList<>(listeEpisode);
    }

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

}