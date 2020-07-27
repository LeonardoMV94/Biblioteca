package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipo_direccion", schema = "biblioteca", catalog = "")
public class TipoDireccionEntity {
    private Integer idTipodir;
    private String descripcion;

    @Id
    @Column(name = "ID_TIPODIR")
    public Integer getIdTipodir() {
        return idTipodir;
    }

    public void setIdTipodir(Integer idTipodir) {
        this.idTipodir = idTipodir;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDireccionEntity that = (TipoDireccionEntity) o;
        return Objects.equals(idTipodir, that.idTipodir) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipodir, descripcion);
    }
}
