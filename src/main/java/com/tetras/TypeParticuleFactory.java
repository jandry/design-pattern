package com.tetras;

import java.util.HashMap;
import java.util.Map;

public class TypeParticuleFactory {

    private static Map<String, TypeParticule> cache = new HashMap<>();

    public static TypeParticule getTypeParticule(String type) {
        return cache.computeIfAbsent(type, t -> compute(t));

    }

    private static TypeParticule compute(String type) {
        switch (type) {
            case "proton":
                return new TypeParticule(type, new Byte[] { 1, 3, 4 });
            case "neutron":
                return new TypeParticule(type, new Byte[] { 5, 4, 9, 1 });
            case "electron":
                return new TypeParticule(type, new Byte[] { 10, 6, 3, 7 });
            default:
                throw new RuntimeException("not possible");
        }
    }

    public static int getTailleEnByte() {
        return cache.values().stream().mapToInt(t -> t.getTailleEnByte()).sum();
    }

}