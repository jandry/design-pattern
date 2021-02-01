package com.tetras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tetras.ingredient.DoseUrineMusaraigne;
import com.tetras.ingredient.FeuilleSecheTout;
import com.tetras.materiel.PieceMolduArgent;
import com.tetras.materiel.PieceOr;
import com.tetras.materiel.Recipient;

import org.junit.jupiter.api.Test;

public class PotionTest {

    public void attendre(int minute) {

    }

    @Test
    public void preparerPotionBrilleTout() {
        PieceMolduArgent piece = PieceMolduArgent.prendre();
        Recipient recipient = Recipient.prendre();
        FeuilleSecheTout feuille = FeuilleSecheTout.prendre();
        DoseUrineMusaraigne dose1 = DoseUrineMusaraigne.prendre();
        DoseUrineMusaraigne dose2 = DoseUrineMusaraigne.prendre();
        //
        recipient.ajouter(piece);
        piece.couvrir(dose1);
        piece.couvrir(dose2);
        attendre(5);
        piece.essuyer(feuille);
        Object result = piece.transformer();
        //
        assertTrue(result instanceof PieceOr);
    }
}