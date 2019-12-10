package com.tetras.application;

import java.util.HashMap;
import java.util.Map;

import com.tetras.librairie.Eleve;
import com.tetras.librairie.ServiceInfoEleve;

public class ServiceInfoEleveCache {

    Map<Integer, Eleve> cache = new HashMap<>();

    public Eleve getInformationEleve(int id) {
        Eleve result = cache.get(id);
        if (result == null) {
            result = new ServiceInfoEleve().getInformationEleve(id);
            cache.put(id, result);
        }
        return result;
    }

}