package com.tetras.holo;

public class HoloFactory {

    public HoloDatePicker createHoloDatePicker() {
        return new HoloDatePicker();
    }

    public HoloLabel createHoloLabel() {
        return new HoloLabel();
    }

    public HoloButton createHoloButton() {
        return new HoloButton();
    }
}
