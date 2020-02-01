package com.tetras;

public class Superman {

    // volatile protège de la lecture lors d'une écriture
    private static volatile Superman instance;

    private Superman() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Superman getInstance() {
        if (instance == null) {
            synchronized (Superman.class) {
                if (instance == null) {
                    instance = new Superman();
                }
            }
        }
        return instance;
    }

}