package com.tetras;

public class TransportDeTroupes {
    private Clone cloneOriginal = new Clone();

    public Clone sortirClone() {
        try {
            return (Clone) cloneOriginal.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}