package com.exe.CineMax.services;

import com.exe.CineMax.persistence.entities.FuncionEntity;
import com.exe.CineMax.models.FuncionDTO;
import com.exe.CineMax.persistence.repositories.FuncionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionServiceImpl implements FuncionService{

    @Autowired
    public FuncionRepository fr;

    @Override
    public List<FuncionDTO> getListaFuncion() {
        List<FuncionEntity> funcionEntidad = fr.findAll();
        List<FuncionDTO> listaFunciones = new ArrayList<>();

        for (FuncionEntity f: funcionEntidad){
            FuncionDTO fDto = new FuncionDTO();
            fDto.setIdFuncion(f.getIdFuncion());
            fDto.setFechaFuncion(f.getFechaFuncion());
            fDto.setHoraFuncion(f.getHoraFuncion());
            //to.setPelicula(f.getPeliculaEntity());
            fDto.setNombrePeli(f.getPeliculaEntity().getTitulo());
            fDto.setGenero(f.getPeliculaEntity().getGenero());
            listaFunciones.add(fDto);
        }
        return listaFunciones;
    }

    @Override
    public Optional<FuncionEntity> getFuncion(int id) {
        return fr.findById(id);
    }

    @Override
    public FuncionEntity agregarFuncion(FuncionEntity funcionEntity) {
        return fr.save(funcionEntity);
    }

    @Override
    public void modificarFuncion(FuncionEntity funcionEntity) {

        Optional<FuncionEntity> miOp = fr.findById(funcionEntity.getIdFuncion());

        if(miOp.isPresent()){
            fr.save(funcionEntity);
        }
    }

    @Override
    public void eliminarFuncion(int id) {

        fr.deleteById(id);
    }
}
