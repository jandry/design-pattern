package com.tetras;

public class Superman {

    private static Superman instance = null;

    public static Superman getInstance() {
        if (instance == null) {
            instance = new Superman();
        }
        return instance;
    }

    private Superman() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}