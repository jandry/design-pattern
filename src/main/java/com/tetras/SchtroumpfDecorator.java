package com.tetras;

public class SchtroumpfDecorator implements Schtroumpf {

    private Schtroumpf schtroumpf;

    public SchtroumpfDecorator(Schtroumpf schtroumpf) {
        this.schtroumpf = schtroumpf;
    }

    public String saluer() {
        return "Bien le bon Schtroumpf";
    }

    public String direAuRevoir() {
        return "Au reSchtroumpf";
    }

    @Override
    public String discuter() {
        return schtroumpf.discuter();
    }

}