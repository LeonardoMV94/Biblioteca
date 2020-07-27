package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "contacto", schema = "biblioteca", catalog = "")
public class ContactoEntity {
    private Integer idContacto;
    private String nombreCtc;
    private String patCtc;
    private String matCtc;
    private Integer idRutcliFk;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTACTO")
    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    @Basic
    @Column(name = "NOMBRE_CTC")
    public String getNombreCtc() {
        return nombreCtc;
    }

    public void setNombreCtc(String nombreCtc) {
        this.nombreCtc = nombreCtc;
    }

    @Basic
    @Column(name = "PAT_CTC")
    public String getPatCtc() {
        return patCtc;
    }

    public void setPatCtc(String patCtc) {
        this.patCtc = patCtc;
    }

    @Basic
    @Column(name = "MAT_CTC")
    public String getMatCtc() {
        return matCtc;
    }

    public void setMatCtc(String matCtc) {
        this.matCtc = matCtc;
    }

    @Basic
    @Column(name = "ID_RUTCLI_FK")
    public Integer getIdRutcliFk() {
        return idRutcliFk;
    }

    public void setIdRutcliFk(Integer idRutcliFk) {
        this.idRutcliFk = idRutcliFk;
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
        ContactoEntity that = (ContactoEntity) o;
        return Objects.equals(idContacto, that.idContacto) &&
                Objects.equals(nombreCtc, that.nombreCtc) &&
                Objects.equals(patCtc, that.patCtc) &&
                Objects.equals(matCtc, that.matCtc) &&
                Objects.equals(idRutcliFk, that.idRutcliFk) &&
                Objects.equals(idRuttraCrea, that.idRuttraCrea) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(idRuttraMod, that.idRuttraMod) &&
                Objects.equals(fechaModifica, that.fechaModifica) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContacto, nombreCtc, patCtc, matCtc, idRutcliFk, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
