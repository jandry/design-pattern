package com.tetras.generic;

public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
        System.out.println(getName() + " created");
    }

    protected String getName() {
        return name;
    }

}