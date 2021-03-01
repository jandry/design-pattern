package com.tetras;

import java.util.ArrayList;
import java.util.List;

public abstract class BadGuy {

    private List<PierreInfinite> gant = new ArrayList<>();

    public void recupererPierreInfinite(Temple temple) {
        DemandeRecuperationPierreInfinite demande = new DemandeRecuperationPierreInfinite(this);
        //
        PierreInfinite pierre = temple.recupererPierreInfinite(demande);
        if (pierre != null)
            gant.add(pierre);
    }

    public int compterPierreGant() {
        return gant.size();
    }

}