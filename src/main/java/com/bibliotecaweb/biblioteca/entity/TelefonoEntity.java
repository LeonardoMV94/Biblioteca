package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "telefono", schema = "biblioteca", catalog = "")
public class TelefonoEntity {
    private Integer idTelefono;
    private String telefono;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @Column(name = "ID_TELEFONO")
    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    @Basic
    @Column(name = "TELEFONO")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        TelefonoEntity that = (TelefonoEntity) o;
        return Objects.equals(idTelefono, that.idTelefono) &&
                Objects.equals(telefono, that.telefono) &&
                Objects.equals(idRuttraCrea, that.idRuttraCrea) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(idRuttraMod, that.idRuttraMod) &&
                Objects.equals(fechaModifica, that.fechaModifica) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTelefono, telefono, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
