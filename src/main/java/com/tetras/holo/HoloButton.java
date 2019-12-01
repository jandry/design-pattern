package com.tetras.holo;

public class HoloButton {

    private String name = "HoloButton";

    public HoloButton() {
        System.out.println(name + " created");
    }

    public String click() {
        return name + " clicked";
    }
}
