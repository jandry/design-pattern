package com.tetras.material;

public class MaterialFactory {

    public MaterialDatePicker createMaterialDatePicker() {
        return new MaterialDatePicker();
    }

    public MaterialLabel createMaterialLabel() {
        return new MaterialLabel();
    }

    public MaterialButton createMaterialButton() {
        return new MaterialButton();
    }
}
