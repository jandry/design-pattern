package com.tetras;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tetras.ingredient.DoseUrineMusaraigne;
import com.tetras.ingredient.FeuilleSecheTout;
import com.tetras.materiel.PieceMolduArgent;
import com.tetras.materiel.PieceOr;
import com.tetras.materiel.Recipient;
import com.tetras.potion.PotionBrilleToutFacade;

import org.junit.jupiter.api.Test;

public class PotionTest {

    @Test
    public void preparerPotionBrilleTout() {
        PieceMolduArgent piece = PieceMolduArgent.prendre();
        Recipient recipient = Recipient.prendre();
        DoseUrineMusaraigne dose1 = DoseUrineMusaraigne.prendre();
        DoseUrineMusaraigne dose2 = DoseUrineMusaraigne.prendre();
        FeuilleSecheTout feuille = FeuilleSecheTout.prendre();
        //
        PieceOr result = PotionBrilleToutFacade.transform(piece, recipient, dose1, dose2,feuille);
        //
        assertNotNull(result);
    }
}