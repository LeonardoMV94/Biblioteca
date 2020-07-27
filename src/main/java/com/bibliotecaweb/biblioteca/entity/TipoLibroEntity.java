package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipo_libro", schema = "biblioteca", catalog = "")
public class TipoLibroEntity {
    private Integer idTipoLibro;
    private String descripcionTipoLibro;

    @Id
    @Column(name = "ID_TIPO_LIBRO")
    public Integer getIdTipoLibro() {
        return idTipoLibro;
    }

    public void setIdTipoLibro(Integer idTipoLibro) {
        this.idTipoLibro = idTipoLibro;
    }

    @Basic
    @Column(name = "DESCRIPCION_TIPO_LIBRO")
    public String getDescripcionTipoLibro() {
        return descripcionTipoLibro;
    }

    public void setDescripcionTipoLibro(String descripcionTipoLibro) {
        this.descripcionTipoLibro = descripcionTipoLibro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoLibroEntity that = (TipoLibroEntity) o;
        return Objects.equals(idTipoLibro, that.idTipoLibro) &&
                Objects.equals(descripcionTipoLibro, that.descripcionTipoLibro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoLibro, descripcionTipoLibro);
    }
}
