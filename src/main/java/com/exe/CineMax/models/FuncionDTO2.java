package com.exe.CineMax.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionDTO2 {
    private int idFuncion;

    private Date fechaFuncion;

    private Time horaFuncion;
}
