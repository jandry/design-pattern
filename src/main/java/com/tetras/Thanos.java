package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class Thanos {
    private List<PierreInfinite> gant = new ArrayList<>();

    public void recupererPierreInfinite(Temple temple) {
        gant.add(temple.recupererPierreInfinite());
    }

    public int compterPierreGant() {
        return gant.size();
    }
}