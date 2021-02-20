package com.tetras;

public class Particule {
    private int x;
    private int y;
    private int z;
    private String type;
    private Byte[] sprite;

    public Particule(int x, int y, int z, String type, Byte[] sprite) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
        this.sprite = sprite;
    }

    public void dessiner() {
    }

    public int getTailleEnByte() {
        // Taille approximataive : 1 byte par int + 1 byte par charactère de la string +
        // 1 byte par élément du sprite
        return 3 + type.length() + sprite.length;
    }

}