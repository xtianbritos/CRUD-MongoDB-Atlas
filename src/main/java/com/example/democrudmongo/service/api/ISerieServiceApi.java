package com.example.democrudmongo.service.api;

import com.example.democrudmongo.model.Serie;

public interface ISerieServiceApi {
    Iterable<Serie> obtenerSeries();
    Serie obtenerSeriePorId(String id);
    Serie guardarSerie(Serie serie);
    Serie actualizarSeriePorId(String id, Serie datos);
    void eliminarSeriePorId(String id);
}
