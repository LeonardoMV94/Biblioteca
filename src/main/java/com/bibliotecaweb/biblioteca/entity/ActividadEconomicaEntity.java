package com.bibliotecaweb.biblioteca.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "actividad_economica", schema = "biblioteca", catalog = "")
public class ActividadEconomicaEntity {

    @Id
    @Column(name = "ID_ACTECO")
    private Integer idActeco;

    @Basic
    @Column(name = "DESCRIPCION_ACT")
    private String descripcionAct;



}
