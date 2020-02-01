package com.tetras;

public class Superman {

    private static class SupermanHolder {
        public static Superman instance = new Superman();
    }

    public static Superman getInstance() {
        return SupermanHolder.instance;
    }

    private Superman() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}