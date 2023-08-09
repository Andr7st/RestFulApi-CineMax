package com.exe.CineMax.services;

import com.exe.CineMax.repositories.FuncionEntity;
import com.exe.CineMax.repositories.PeliculaEntity;
import com.exe.CineMax.models.FuncionDTO2;
import com.exe.CineMax.models.PeliculaDTO;
import com.exe.CineMax.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    private PeliculaRepository pr;


    @Override
    public List<PeliculaDTO> getListaPeliculas() {
        List<PeliculaEntity> peliculaEntityEntidad = pr.findAll();
        List<PeliculaDTO> listaPeliculas = new ArrayList<>();

        for (PeliculaEntity p: peliculaEntityEntidad){
            PeliculaDTO pDto = new PeliculaDTO();
            pDto.setIdPelicula(p.getIdPelicula());
            pDto.setTitulo(p.getTitulo());
            pDto.setDuracion(p.getDuracion());
            pDto.setGenero(p.getGenero());
            pDto.setEstreno(p.getEstreno());
                for (FuncionEntity fun:p.getListaFuncionEntity()) {
                    FuncionDTO2 fDTO = new FuncionDTO2();
                    fDTO.setIdFuncion(fun.getIdFuncion());
                    fDTO.setFechaFuncion(fun.getFechaFuncion());
                    fDTO.setHoraFuncion(fun.getHoraFuncion());
                    //fDTO.setNombrePeli(p.getTitulo());
                    pDto.getListaFuncion().add(fDTO);
            }

            listaPeliculas.add(pDto);
        }
        return listaPeliculas;
    }

    @Override
    public Optional getPelicula(int id) {

        Optional<PeliculaEntity> miOp = pr.findById(id);

        return miOp;
    }

    @Override
    public PeliculaEntity agregarPelicula(PeliculaEntity peliculaEntity) {

        return pr.save(peliculaEntity);

    }

    @Override
    public void modificarPelicula(PeliculaEntity peliculaEntity) {

        Optional<PeliculaEntity> miOp = pr.findById(peliculaEntity.getIdPelicula());

        if(miOp.isPresent()){
            /*Pelicula peliculaEncontrada = miOp.get();
            peliculaEncontrada.setTitulo(pelicula.getTitulo());
            peliculaEncontrada.setDuracion(pelicula.getDuracion());
            peliculaEncontrada.setEstreno(pelicula.getEstreno());
            peliculaEncontrada.setGenero(pelicula.getGenero());
            */

            pr.save(peliculaEntity);
        }
    }

    @Override
    public void eliminarPelicula(int id) {
        pr.deleteById(id);

    }
}
