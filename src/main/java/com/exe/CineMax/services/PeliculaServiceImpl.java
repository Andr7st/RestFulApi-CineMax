package com.exe.CineMax.services;

import com.exe.CineMax.models.FuncionDTO;
import com.exe.CineMax.persistence.entities.FuncionEntity;
import com.exe.CineMax.persistence.entities.PeliculaEntity;
import com.exe.CineMax.models.PeliculaDTO;
import com.exe.CineMax.persistence.repositories.PeliculaRepository;
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
        List<PeliculaEntity> peliculaEntidad = pr.findAll();
        List<PeliculaDTO> listaPeliculas = new ArrayList<>();

        for (PeliculaEntity p: peliculaEntidad){
            PeliculaDTO pDTO = new PeliculaDTO();
            pDTO.setIdPelicula(p.getIdPelicula());
            pDTO.setTitulo(p.getTitulo());
            pDTO.setDuracion(p.getDuracion());
            pDTO.setGenero(p.getGenero());
            pDTO.setEstreno(p.getEstreno());
                for (FuncionEntity fun:p.getListaFuncionEntity()) {
                    FuncionDTO fDTO = new FuncionDTO();
                    fDTO.setIdFuncion(fun.getIdFuncion());
                    fDTO.setFechaFuncion(fun.getFechaFuncion());
                    fDTO.setHoraFuncion(fun.getHoraFuncion());
                    //fDTO.setNombrePeli(p.getTitulo());
                    pDTO.getListaFuncion().add(fDTO);
            }

            listaPeliculas.add(pDTO);
        }
        return listaPeliculas;
    }

    @Override
    public PeliculaDTO getPelicula(int id) {

       Optional<PeliculaEntity> miOp = pr.findById(id);

       if (miOp.isPresent()){
           PeliculaEntity pe = miOp.get();
           PeliculaDTO peliculaEncontrada = new PeliculaDTO();
           peliculaEncontrada.setIdPelicula(pe.getIdPelicula());
           peliculaEncontrada.setTitulo(pe.getTitulo());
           peliculaEncontrada.setGenero(pe.getGenero());
           peliculaEncontrada.setEstreno(pe.getEstreno());
           peliculaEncontrada.setDuracion(pe.getDuracion());
            for (FuncionEntity fun:pe.getListaFuncionEntity()) {
                FuncionDTO fDTO = new FuncionDTO();
                fDTO.setIdFuncion(fun.getIdFuncion());
                fDTO.setFechaFuncion(fun.getFechaFuncion());
                fDTO.setHoraFuncion(fun.getHoraFuncion());
                peliculaEncontrada.getListaFuncion().add(fDTO);
            }


           return peliculaEncontrada;
       }

       // peliculaEncontrada.setIdPelicula(miOp.get);

        return null;
    }

    @Override
    public PeliculaDTO agregarPelicula(PeliculaDTO peliculaDTO) {

       PeliculaEntity peliculaEntidad = new PeliculaEntity();
       peliculaEntidad.setDuracion(peliculaDTO.getDuracion());
       peliculaEntidad.setEstreno(peliculaDTO.getEstreno());
       peliculaEntidad.setGenero(peliculaDTO.getGenero());
       peliculaEntidad.setTitulo(peliculaDTO.getTitulo());
         for (FuncionDTO funcion:peliculaDTO.getListaFuncion()) {
            FuncionEntity funcionEntidad = new FuncionEntity();
            funcionEntidad.setIdFuncion(funcion.getIdFuncion());
            //funcionEntidad.setFechaFuncion(funcion.getFechaFuncion());
            //funcionEntidad.setHoraFuncion(funcion.getHoraFuncion());
            peliculaEntidad.getListaFuncionEntity().add(funcionEntidad);
            
        }
        System.out.println(peliculaEntidad.toString());
       pr.save(peliculaEntidad);

       peliculaDTO.setIdPelicula(peliculaEntidad.getIdPelicula());

       return peliculaDTO;

    }

    @Override
    public PeliculaDTO modificarPelicula(PeliculaDTO peliculaDTO) {

        PeliculaEntity peliculaEntidad = new PeliculaEntity();
        peliculaEntidad.setIdPelicula(peliculaDTO.getIdPelicula());
        peliculaEntidad.setTitulo(peliculaDTO.getTitulo());
        peliculaEntidad.setDuracion(peliculaDTO.getDuracion());
        peliculaEntidad.setGenero(peliculaDTO.getGenero());
        peliculaEntidad.setEstreno(peliculaDTO.getEstreno());
        Optional<PeliculaEntity> miOp = pr.findById(peliculaEntidad.getIdPelicula());

        if(miOp.isPresent()){
            /*Pelicula peliculaEncontrada = miOp.get();
            peliculaEncontrada.setTitulo(pelicula.getTitulo());
            peliculaEncontrada.setDuracion(pelicula.getDuracion());
            peliculaEncontrada.setEstreno(pelicula.getEstreno());
            peliculaEncontrada.setGenero(pelicula.getGenero());
            */

            pr.save(peliculaEntidad);
        }
        return peliculaDTO;
    }

    @Override
    public void eliminarPelicula(int id) {
        pr.deleteById(id);

    }
}
