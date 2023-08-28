package com.exe.CineMax.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

@Entity (name = "funciones")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idFuncion")
//@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFuncion;

    private Date fechaFuncion;

    private Time horaFuncion;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pelicula")
    private PeliculaEntity peliculaEntity;

    @ManyToMany(mappedBy = "listaFunciones")
    private List<SalaEntity> listaSalaEntities;

    @OneToMany(mappedBy = "funcionEntity")
    private List<ReservaEntity> listaReservaEntities;

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }


    public Date getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(Date fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public Time getHoraFuncion() {
        return horaFuncion;
    }

    public void setHoraFuncion(Time horaFuncion) {
        this.horaFuncion = horaFuncion;
    }

    public PeliculaEntity getPeliculaEntity() {
        return peliculaEntity;
    }

    public void setPeliculaEntity(PeliculaEntity peliculaEntity) {
        this.peliculaEntity = peliculaEntity;
    }

    @Override
    public String toString() {
        return "FuncionEntity{" +
                "idFuncion=" + idFuncion +
                ", fechaFuncion=" + fechaFuncion +
                ", horaFuncion=" + horaFuncion +
                '}';
    }
}
