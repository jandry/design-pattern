package com.tetras.material;

import com.tetras.generic.AbstractFactory;
import com.tetras.generic.Button;
import com.tetras.generic.DatePicker;
import com.tetras.generic.Label;

public class MaterialFactory extends AbstractFactory {
    @Override
    public DatePicker createDatePicker() {
        return new MaterialDatePicker();
    }

    @Override
    public Label createLabel() {
        return new MaterialLabel();
    }

    @Override
    public Button createButton() {
        return new MaterialButton();
    }
}
