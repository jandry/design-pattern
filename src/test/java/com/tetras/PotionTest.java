package com.tetras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tetras.ingredient.DoseUrineMusaraigne;
import com.tetras.materiel.PieceMolduArgent;
import com.tetras.materiel.PieceOr;
import com.tetras.materiel.Recipient;

import org.junit.jupiter.api.Test;

public class PotionTest {

    public void attendre(int minute) {

    }

    @Test
    public void preparerPotionBrilleTout() {
        PieceMolduArgent piece = new PieceMolduArgent();
        Recipient recipient = new Recipient();
        recipient.ajouter(piece);
        DoseUrineMusaraigne dose1 = DoseUrineMusaraigne.prendre();
        recipient.ajouter(dose1);
        DoseUrineMusaraigne dose2 = DoseUrineMusaraigne.prendre();
        recipient.ajouter(dose2);
        attendre(5);

        assertTrue(piece.transformer() instanceof PieceOr);
    }
}