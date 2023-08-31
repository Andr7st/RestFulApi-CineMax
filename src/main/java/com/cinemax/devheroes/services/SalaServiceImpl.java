package com.cinemax.devheroes.services;

import com.cinemax.devheroes.persistence.entities.SalaEntity;
import com.cinemax.devheroes.persistence.repositories.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaServiceImpl implements SalaService{
    @Autowired
    public SalaRepository sr;
    @Override
    public List<SalaEntity> getListaSalas() {
        return sr.findAll();    }

    @Override
    public Optional<SalaEntity> getSala(int id) {
        return sr.findById(id);    }

    @Override
    public SalaEntity agregarSala(SalaEntity salaEntity) {
        return sr.save(salaEntity);    }

    @Override
    public void modificarSala(SalaEntity salaEntity) {

        Optional<SalaEntity> miOp = sr.findById(salaEntity.getIdSala());

        if(miOp.isPresent()){
            sr.save(salaEntity);
        }

    }

    @Override
    public void eliminarSala(int id) {

        sr.deleteById(id);

    }
}
