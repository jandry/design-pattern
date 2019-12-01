package com.tetras.generic;

public abstract class Button extends Component {

    public Button(String name) {
        super(name);
    }

    public String click() {
        return getName() + " clicked";
    }
}