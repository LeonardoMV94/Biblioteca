package com.bibliotecaweb.biblioteca.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "actividad_economica", schema = "biblioteca", catalog = "")
public class ActividadEconomicaEntity {

    @Id
    @Column(name = "ID_ACTECO")
    private Integer idActeco;

    @Basic
    @Column(name = "DESCRIPCION_ACT")
    private String descripcionAct;

    public Integer getIdActeco() {
        return idActeco;
    }

    public void setIdActeco(Integer idActeco) {
        this.idActeco = idActeco;
    }

    public String getDescripcionAct() {
        return descripcionAct;
    }

    public void setDescripcionAct(String descripcionAct) {
        this.descripcionAct = descripcionAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActividadEconomicaEntity)) return false;
        ActividadEconomicaEntity that = (ActividadEconomicaEntity) o;
        return Objects.equals(getIdActeco(), that.getIdActeco()) &&
                Objects.equals(getDescripcionAct(), that.getDescripcionAct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdActeco(), getDescripcionAct());
    }
}
