package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "actividad_economica", schema = "biblioteca", catalog = "")
public class ActividadEconomicaEntity {
    private Integer idActeco;
    
    private String descripcionAct;

    @Id
    @Column(name = "ID_ACTECO")
    public Integer getIdActeco() {
        return idActeco;
    }

    public void setIdActeco(Integer idActeco) {
        this.idActeco = idActeco;
    }

    @Basic
    @Column(name = "DESCRIPCION_ACT")
    public String getDescripcionAct() {
        return descripcionAct;
    }

    public void setDescripcionAct(String descripcionAct) {
        this.descripcionAct = descripcionAct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActividadEconomicaEntity that = (ActividadEconomicaEntity) o;
        return Objects.equals(idActeco, that.idActeco) &&
                Objects.equals(descripcionAct, that.descripcionAct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idActeco, descripcionAct);
    }
}
