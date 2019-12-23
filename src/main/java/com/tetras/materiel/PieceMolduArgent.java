package com.tetras.materiel;

import com.tetras.ingredient.DoseUrineMusaraigne;
import com.tetras.ingredient.FeuilleSecheTout;
import com.tetras.ingredient.Ingredient;

public class PieceMolduArgent implements Ingredient {

    public static PieceMolduArgent prendre() {
        return new PieceMolduArgent();
    }

    public void couvrir(DoseUrineMusaraigne dose) {

    }

    public void essuyer(FeuilleSecheTout feuille) {

    }

    public PieceOr transformer() {
        return new PieceOr();
    }
}