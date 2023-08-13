package com.exe.CineMax.repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservas")
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    private int entradas;

    private Date fechaReserva;

    @ManyToMany
    @JoinTable(name = "reserva_usuarios", joinColumns = @JoinColumn(name = "id_reserva"),
            inverseJoinColumns = @JoinColumn(name = "id_usuarios") )
    private List<UsuarioEntity> listaUsuariosEntity;

    @ManyToOne
    @JoinColumn(name = "id_funcion")
    private FuncionEntity funcionEntity;

}
