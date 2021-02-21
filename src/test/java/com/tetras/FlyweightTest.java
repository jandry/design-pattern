package com.tetras;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @Test
    public void test() {
        List<Particule> listeParticule = new ArrayList<>();
        int tailleTotale = 0;
        int nbParticule = 100;
        for (int i = 0; i < nbParticule; i++) {
            Particule p = new Particule(new Random().nextInt(), new Random().nextInt(), new Random().nextInt(),
                    choisirType(i));
            listeParticule.add(p);
            tailleTotale += p.getTailleEnByte();
        }
        tailleTotale += TypeParticuleFactory.getTailleEnByte();
        System.out.println(MessageFormat.format("Taille pour {0} particules : {1} Bytes", nbParticule, tailleTotale));
    }

    private String choisirType(int i) {
        switch (i % 3) {
            case 0:
                return "proton";
            case 1:
                return "neutron";
            case 2:
                return "electron";
            default:
                throw new RuntimeException("not possible");
        }
    }

}