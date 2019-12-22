package com.tetras;

public class MaitreJediFactory {

    public static MaitreJedi getMaitreJedi(MaitreType type) {
        if (MaitreType.yoda.equals(type))
            return new Yoda();
        else if (MaitreType.lukeSkywalker.equals(type))
            return new LukeSkywalker();
        else
            throw new IllegalArgumentException();
    }
}