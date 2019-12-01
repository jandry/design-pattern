package com.tetras.generic;

public abstract class Label extends Component {

    public Label(String name) {
        super(name);
    }

    public String show() {
        return getName() + " shown";
    }
}