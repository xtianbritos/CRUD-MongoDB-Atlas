package com.example.democrudmongo.controller;

import com.example.democrudmongo.model.Serie;
import com.example.democrudmongo.service.api.SerieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/series")
public class SerieController {

    @Autowired
    SerieServiceImpl service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Iterable<Serie> obtenerSeries() {
        return service.obtenerSeries();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Serie obtenerSeriePorId(@PathVariable String id) {
        return service.obtenerSeriePorId(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Serie guardarSerie(@RequestBody Serie serie) {
        return service.guardarSerie(serie);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("{id}")
    public Serie actualizarSeriePorId(String id, Serie datos) {
        return service.actualizarSeriePorId(id, datos);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void eliminarSeriePorId(String id) {
        service.eliminarSeriePorId(id);
    }
}
