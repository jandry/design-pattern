package com.tetras.material;

public class MaterialButton {

    private String name = "MaterialButton";

    public MaterialButton() {
        System.out.println(name + " created");
    }

    public String click() {
        return name + " clicked";
    }
}
