package com.tetras;

public class Particule {
    private int x;
    private int y;
    private int z;
    private TypeParticule type;

    public Particule(int x, int y, int z, String type) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = TypeParticuleFactory.getTypeParticule(type);
    }

    public void dessiner() {
    }

    public int getTailleEnByte() {
        // Taille approximataive : 1 byte par int + 1 byte pour la référence sur le type
        // de particule
        return 4;
    }

}