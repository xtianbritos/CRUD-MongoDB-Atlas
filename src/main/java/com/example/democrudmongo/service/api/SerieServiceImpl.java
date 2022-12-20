package com.example.democrudmongo.service.api;

import com.example.democrudmongo.dao.api.SerieRepository;
import com.example.democrudmongo.model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieServiceImpl implements ISerieServiceApi{

    @Autowired
    SerieRepository repo;

    @Override
    public Iterable<Serie> obtenerSeries() {
        return repo.findAll();
    }

    @Override
    public Serie obtenerSeriePorId(String id) {
        return repo.findById(id).orElseThrow(()-> {throw new RuntimeException("La serie con ese ID no existe");});
    }

    @Override
    public Serie guardarSerie(Serie serie) {
        return repo.save(serie);
    }

    @Override
    public Serie actualizarSeriePorId(String id, Serie datos) {
        Serie serie = obtenerSeriePorId(id);

        serie.setNombre(datos.getNombre());
        serie.setCreador(datos.getCreador());
        serie.setEstreno(datos.getEstreno());
        return serie;
    }

    @Override
    public void eliminarSeriePorId(String id) {
        repo.delete(obtenerSeriePorId(id));
    }
}
