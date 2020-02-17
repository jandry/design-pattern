package com.tetras;

import java.util.ArrayList;
import java.util.List;

import com.tetras.avengers.Avengers;

public class Temple {

    private List<Avengers> protecteurs = new ArrayList<>();

    public void ajouterProtecteur(Avengers protecteur) {
        protecteurs.add(protecteur);
    }

    public PierreInfinite recupererPierreInfinite(DemandeRecuperationPierreInfinite demande) {
        for (Avengers avengers : protecteurs) {
            if (avengers.gagneCombatContre(demande.getRecuperateur())) {
                return null;
            }
        }
        return new PierreInfinite();
    }

}