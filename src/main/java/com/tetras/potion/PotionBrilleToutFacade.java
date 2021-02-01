package com.tetras.potion;

import com.tetras.ingredient.DoseUrineMusaraigne;
import com.tetras.ingredient.FeuilleSecheTout;
import com.tetras.materiel.PieceMolduArgent;
import com.tetras.materiel.PieceOr;
import com.tetras.materiel.Recipient;

public class PotionBrilleToutFacade {

    private static void attendre(int minute) {
    }

    public static PieceOr transform(PieceMolduArgent piece, Recipient recipient, DoseUrineMusaraigne dose1, DoseUrineMusaraigne dose2, FeuilleSecheTout feuille) {
        recipient.ajouter(piece);
        piece.couvrir(dose1);
        piece.couvrir(dose2);
        attendre(5);
        piece.essuyer(feuille);
        return piece.transformer();
    }

}