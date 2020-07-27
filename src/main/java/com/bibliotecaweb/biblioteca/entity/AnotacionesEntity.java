package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "anotaciones", schema = "biblioteca", catalog = "")
public class AnotacionesEntity {
    private Integer idAnotaciones;
    private Timestamp fechaAnota;
    private String observacion;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @Column(name = "ID_ANOTACIONES")
    public Integer getIdAnotaciones() {
        return idAnotaciones;
    }

    public void setIdAnotaciones(Integer idAnotaciones) {
        this.idAnotaciones = idAnotaciones;
    }

    @Basic
    @Column(name = "FECHA_ANOTA")
    public Timestamp getFechaAnota() {
        return fechaAnota;
    }

    public void setFechaAnota(Timestamp fechaAnota) {
        this.fechaAnota = fechaAnota;
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
    @Column(name = "ID_RUTTRA_CREA")
    public Integer getIdRuttraCrea() {
        return idRuttraCrea;
    }

    public void setIdRuttraCrea(Integer idRuttraCrea) {
        this.idRuttraCrea = idRuttraCrea;
    }

    @Basic
    @Column(name = "FECHA_CREACION")
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Basic
    @Column(name = "ID_RUTTRA_MOD")
    public Integer getIdRuttraMod() {
        return idRuttraMod;
    }

    public void setIdRuttraMod(Integer idRuttraMod) {
        this.idRuttraMod = idRuttraMod;
    }

    @Basic
    @Column(name = "FECHA_MODIFICA")
    public Timestamp getFechaModifica() {
        return fechaModifica;
    }

    public void setFechaModifica(Timestamp fechaModifica) {
        this.fechaModifica = fechaModifica;
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
        AnotacionesEntity that = (AnotacionesEntity) o;
        return Objects.equals(idAnotaciones, that.idAnotaciones) &&
                Objects.equals(fechaAnota, that.fechaAnota) &&
                Objects.equals(observacion, that.observacion) &&
                Objects.equals(idRuttraCrea, that.idRuttraCrea) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(idRuttraMod, that.idRuttraMod) &&
                Objects.equals(fechaModifica, that.fechaModifica) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAnotaciones, fechaAnota, observacion, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
