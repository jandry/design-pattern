package com.tetras;

public class Superman {

    private static Superman instance = new Superman();

    private Superman() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Superman getInstance() {
        return instance;
    }

}