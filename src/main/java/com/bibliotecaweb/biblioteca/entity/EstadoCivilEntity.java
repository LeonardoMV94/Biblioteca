package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "estado_civil", schema = "biblioteca", catalog = "")
public class EstadoCivilEntity {
    private Integer idEcivil;
    private String descripcionEcivil;

    @Id
    @Column(name = "ID_ECIVIL")
    public Integer getIdEcivil() {
        return idEcivil;
    }

    public void setIdEcivil(Integer idEcivil) {
        this.idEcivil = idEcivil;
    }

    @Basic
    @Column(name = "DESCRIPCION_ECIVIL")
    public String getDescripcionEcivil() {
        return descripcionEcivil;
    }

    public void setDescripcionEcivil(String descripcionEcivil) {
        this.descripcionEcivil = descripcionEcivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoCivilEntity that = (EstadoCivilEntity) o;
        return Objects.equals(idEcivil, that.idEcivil) &&
                Objects.equals(descripcionEcivil, that.descripcionEcivil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEcivil, descripcionEcivil);
    }
}
