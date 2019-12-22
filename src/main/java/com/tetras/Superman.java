package com.tetras;

public class Superman {

    private static Superman instance = new Superman();

    private Superman() {
    }

    public static Superman getInstance() {
        return instance;
    }

}