package com.tetras.holo;

import com.tetras.generic.AbstractFactory;
import com.tetras.generic.Button;
import com.tetras.generic.DatePicker;
import com.tetras.generic.Label;

public class HoloFactory extends AbstractFactory {
    @Override
    public DatePicker createDatePicker() {
        return new HoloDatePicker();
    }

    @Override
    public Label createLabel() {
        return new HoloLabel();
    }

    @Override
    public Button createButton() {
        return new HoloButton();
    }
}
