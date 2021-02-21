package com.tetras;

public class TypeParticule {
    private String type;
    private Byte[] sprite;

    public TypeParticule(String type, Byte[] sprite) {
        this.type = type;
        this.sprite = sprite;
    }

    public int getTailleEnByte() {
        // Taille approximataive : 2 * 1 byte par charactère de la string ( clé plus
        // valeur) +
        // 1 byte par élément du sprite
        return type.length() * 2 + sprite.length;
    }
}