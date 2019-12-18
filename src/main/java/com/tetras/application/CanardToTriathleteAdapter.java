package com.tetras.application;

import com.tetras.librarie.Canard;

public class CanardToTriathleteAdapter extends Canard implements Triathlete {

    @Override
    public void faireUnTriathlon() {
        nager(1500);
        voler(40000);
        marcher(10000);
    }

}