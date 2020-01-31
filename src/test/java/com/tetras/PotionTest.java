package com.tetras;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.tetras.materiel.PieceMolduArgent;
import com.tetras.materiel.PieceOr;
import com.tetras.potion.PotionBrilleToutFacade;

import org.junit.jupiter.api.Test;

public class PotionTest {

    @Test
    public void preparerPotionBrilleTout() {
        PieceMolduArgent piece = new PieceMolduArgent();
        assertTrue(PotionBrilleToutFacade.transform(piece) instanceof PieceOr);
    }
}