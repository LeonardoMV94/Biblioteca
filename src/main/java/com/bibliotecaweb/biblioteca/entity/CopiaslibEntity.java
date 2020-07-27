package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "copiaslib", schema = "biblioteca", catalog = "")
public class CopiaslibEntity {
    private Integer idCopialib;
    private Integer idCodBarra;
    private Integer numcopiaLib;
    private String observacion;
    private Integer idCopialibTipoVntFk;
    private Integer idCompra;
    private Byte estado;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COPIALIB")
    public Integer getIdCopialib() {
        return idCopialib;
    }

    public void setIdCopialib(Integer idCopialib) {
        this.idCopialib = idCopialib;
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
    @Column(name = "NUMCOPIA_LIB")
    public Integer getNumcopiaLib() {
        return numcopiaLib;
    }

    public void setNumcopiaLib(Integer numcopiaLib) {
        this.numcopiaLib = numcopiaLib;
    }

    @Basic
    @Column(name = "OBSERVACION")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Basic
    @Column(name = "ID_COPIALIB_TIPO_VNT_FK")
    public Integer getIdCopialibTipoVntFk() {
        return idCopialibTipoVntFk;
    }

    public void setIdCopialibTipoVntFk(Integer idCopialibTipoVntFk) {
        this.idCopialibTipoVntFk = idCopialibTipoVntFk;
    }

    @Basic
    @Column(name = "ID_COMPRA")
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    @Basic
    @Column(name = "Estado")
    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CopiaslibEntity that = (CopiaslibEntity) o;
        return Objects.equals(idCopialib, that.idCopialib) &&
                Objects.equals(idCodBarra, that.idCodBarra) &&
                Objects.equals(numcopiaLib, that.numcopiaLib) &&
                Objects.equals(observacion, that.observacion) &&
                Objects.equals(idCopialibTipoVntFk, that.idCopialibTipoVntFk) &&
                Objects.equals(idCompra, that.idCompra) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCopialib, idCodBarra, numcopiaLib, observacion, idCopialibTipoVntFk, idCompra, estado);
    }
}
