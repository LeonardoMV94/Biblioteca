package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "libro_materia", schema = "biblioteca", catalog = "")
public class LibroMateriaEntity {
    private Integer idLibmat;
    private Integer idCodBarra;
    private Integer idSubmat;

    @Id
    @Column(name = "ID_LIBMAT")
    public Integer getIdLibmat() {
        return idLibmat;
    }

    public void setIdLibmat(Integer idLibmat) {
        this.idLibmat = idLibmat;
    }

    @Basic
    @Column(name = "ID_COD_BARRA")
    public Integer getIdCodBarra() {
        return idCodBarra;
    }

    public void setIdCodBarra(Integer idCodBarra) {
        this.idCodBarra = idCodBarra;
    }

    @Basic
    @Column(name = "ID_SUBMAT")
    public Integer getIdSubmat() {
        return idSubmat;
    }

    public void setIdSubmat(Integer idSubmat) {
        this.idSubmat = idSubmat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibroMateriaEntity that = (LibroMateriaEntity) o;
        return Objects.equals(idLibmat, that.idLibmat) &&
                Objects.equals(idCodBarra, that.idCodBarra) &&
                Objects.equals(idSubmat, that.idSubmat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLibmat, idCodBarra, idSubmat);
    }
}
