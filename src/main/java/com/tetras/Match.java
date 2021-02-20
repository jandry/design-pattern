package com.tetras;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Match {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    private FaitJeu fait = new FaitJeu();

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void genererFait() {
        FaitJeu fait = new FaitJeu();
        support.firePropertyChange("fait", this.fait, fait);
        this.fait = fait;
    }

}