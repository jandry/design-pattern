package com.tetras;

public class BlackDwarf implements Personnage {
    PierreInfinite pierre;

    public void recupererPierreInfinite(Temple temple) {
        DemandeRecuperationPierreInfinite demande = new DemandeRecuperationPierreInfinite();
        demande.setRecuperateur(this);
        //
        pierre = temple.recupererPierreInfinite(demande);
    }

    public int compterPierreGant() {
        if (pierre != null)
            return 1;
        else
            return 0;
    }
}