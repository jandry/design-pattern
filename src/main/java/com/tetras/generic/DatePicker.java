package com.tetras.generic;

public abstract class DatePicker extends Component {

    public DatePicker(String name) {
        super(name);
    }

    public String select() {
        return getName() + " selected";
    }
}