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
            String type = null;
            Byte[] sprite = null;
            switch (i % 3) {
                case 0:
                    type = "proton";
                    sprite = new Byte[] { 1, 3, 4 };

                    break;
                case 1:
                    type = "neutron";
                    sprite = new Byte[] { 5, 4, 9, 1 };
                    break;
                case 2:
                    type = "electron";
                    sprite = new Byte[] { 10, 6, 3, 7 };
                    break;
                default:
                    throw new RuntimeException("not possible");
            }
            Particule p = new Particule(new Random().nextInt(), new Random().nextInt(), new Random().nextInt(), type,
                    sprite);
            listeParticule.add(p);
            tailleTotale += p.getTailleEnByte();
        }
        System.out.println(MessageFormat.format("Taille pour {0} particules : {1} Bytes", nbParticule, tailleTotale));
    }

}