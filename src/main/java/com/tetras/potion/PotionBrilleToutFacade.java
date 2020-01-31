package com.tetras.potion;

import com.tetras.ingredient.DoseUrineMusaraigne;
import com.tetras.materiel.PieceMolduArgent;
import com.tetras.materiel.PieceOr;
import com.tetras.materiel.Recipient;

public class PotionBrilleToutFacade {

    private static void attendre(int minute) {
    }

    public static PieceOr transform(PieceMolduArgent piece) {
        Recipient recipient = new Recipient();
        recipient.ajouter(piece);
        DoseUrineMusaraigne dose1 = DoseUrineMusaraigne.prendre();
        recipient.ajouter(dose1);
        DoseUrineMusaraigne dose2 = DoseUrineMusaraigne.prendre();
        recipient.ajouter(dose2);
        attendre(5);
        return piece.transformer();
    }

}