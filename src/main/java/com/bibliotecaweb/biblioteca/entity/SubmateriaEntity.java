package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "submateria", schema = "biblioteca", catalog = "")
public class SubmateriaEntity {
    private Integer idSubmat;
    private String descripMat;
    private Integer idMateria;

    @Id
    @Column(name = "ID_SUBMAT")
    public Integer getIdSubmat() {
        return idSubmat;
    }

    public void setIdSubmat(Integer idSubmat) {
        this.idSubmat = idSubmat;
    }

    @Basic
    @Column(name = "DESCRIP_MAT")
    public String getDescripMat() {
        return descripMat;
    }

    public void setDescripMat(String descripMat) {
        this.descripMat = descripMat;
    }

    @Basic
    @Column(name = "ID_MATERIA")
    public Integer getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubmateriaEntity that = (SubmateriaEntity) o;
        return Objects.equals(idSubmat, that.idSubmat) &&
                Objects.equals(descripMat, that.descripMat) &&
                Objects.equals(idMateria, that.idMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSubmat, descripMat, idMateria);
    }
}
