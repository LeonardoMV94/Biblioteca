package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cargos", schema = "biblioteca", catalog = "")
public class CargosEntity {
    private Integer idCargotrab;
    private String descripcionCg;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CARGOTRAB")
    public Integer getIdCargotrab() {
        return idCargotrab;
    }

    public void setIdCargotrab(Integer idCargotrab) {
        this.idCargotrab = idCargotrab;
    }

    @Basic
    @Column(name = "DESCRIPCION_CG")
    public String getDescripcionCg() {
        return descripcionCg;
    }

    public void setDescripcionCg(String descripcionCg) {
        this.descripcionCg = descripcionCg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargosEntity that = (CargosEntity) o;
        return Objects.equals(idCargotrab, that.idCargotrab) &&
                Objects.equals(descripcionCg, that.descripcionCg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCargotrab, descripcionCg);
    }
}
