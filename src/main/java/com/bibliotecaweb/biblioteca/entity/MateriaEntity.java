package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "materia", schema = "biblioteca", catalog = "")
public class MateriaEntity {
    private Integer idMaterias;
    private String descripMat;

    @Id
    @Column(name = "ID_MATERIAS")
    public Integer getIdMaterias() {
        return idMaterias;
    }

    public void setIdMaterias(Integer idMaterias) {
        this.idMaterias = idMaterias;
    }

    @Basic
    @Column(name = "DESCRIP_MAT")
    public String getDescripMat() {
        return descripMat;
    }

    public void setDescripMat(String descripMat) {
        this.descripMat = descripMat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MateriaEntity that = (MateriaEntity) o;
        return Objects.equals(idMaterias, that.idMaterias) &&
                Objects.equals(descripMat, that.descripMat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMaterias, descripMat);
    }
}
