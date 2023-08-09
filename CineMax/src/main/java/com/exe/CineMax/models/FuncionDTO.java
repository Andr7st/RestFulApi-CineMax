package com.exe.CineMax.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionDTO {

    private int idFuncion;

    private Date fechaFuncion;

    private Time horaFuncion;

    //private PeliculaDTO pelicula;

    private String nombrePeli;

    private String genero;


}
