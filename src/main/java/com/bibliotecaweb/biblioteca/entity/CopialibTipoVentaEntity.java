package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "copialib_tipo_venta", schema = "biblioteca", catalog = "")
public class CopialibTipoVentaEntity {
    private Integer idCopialibTipoVnt;
    private String descripcion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COPIALIB_TIPO_VNT")
    public Integer getIdCopialibTipoVnt() {
        return idCopialibTipoVnt;
    }

    public void setIdCopialibTipoVnt(Integer idCopialibTipoVnt) {
        this.idCopialibTipoVnt = idCopialibTipoVnt;
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
        CopialibTipoVentaEntity that = (CopialibTipoVentaEntity) o;
        return Objects.equals(idCopialibTipoVnt, that.idCopialibTipoVnt) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCopialibTipoVnt, descripcion);
    }
}
