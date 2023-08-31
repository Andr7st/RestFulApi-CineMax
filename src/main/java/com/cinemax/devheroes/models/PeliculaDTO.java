package com.cinemax.devheroes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeliculaDTO {

    private int idPelicula;

    private String titulo;

    private String genero;

    private int duracion;

    private int estreno;

    private List<FuncionDTO> listaFuncion = new ArrayList<>();


}
