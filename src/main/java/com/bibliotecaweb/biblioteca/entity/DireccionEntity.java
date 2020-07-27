package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "direccion", schema = "biblioteca", catalog = "")
public class DireccionEntity {
    private Integer idDireccion;
    private Integer idTipodirFk;
    private String calle;
    private Integer numero;
    private Integer idComunaFk;
    private String poblacion;
    private String blocks;
    private String departamento;
    private String sector;
    private String codigoPostal;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DIRECCION")
    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Basic
    @Column(name = "ID_TIPODIR_FK")
    public Integer getIdTipodirFk() {
        return idTipodirFk;
    }

    public void setIdTipodirFk(Integer idTipodirFk) {
        this.idTipodirFk = idTipodirFk;
    }

    @Basic
    @Column(name = "CALLE")
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    @Basic
    @Column(name = "NUMERO")
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "ID_COMUNA_FK")
    public Integer getIdComunaFk() {
        return idComunaFk;
    }

    public void setIdComunaFk(Integer idComunaFk) {
        this.idComunaFk = idComunaFk;
    }

    @Basic
    @Column(name = "POBLACION")
    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Basic
    @Column(name = "BLOCKS")
    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    @Basic
    @Column(name = "DEPARTAMENTO")
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Basic
    @Column(name = "SECTOR")
    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Basic
    @Column(name = "CODIGO_POSTAL")
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
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
        DireccionEntity that = (DireccionEntity) o;
        return Objects.equals(idDireccion, that.idDireccion) &&
                Objects.equals(idTipodirFk, that.idTipodirFk) &&
                Objects.equals(calle, that.calle) &&
                Objects.equals(numero, that.numero) &&
                Objects.equals(idComunaFk, that.idComunaFk) &&
                Objects.equals(poblacion, that.poblacion) &&
                Objects.equals(blocks, that.blocks) &&
                Objects.equals(departamento, that.departamento) &&
                Objects.equals(sector, that.sector) &&
                Objects.equals(codigoPostal, that.codigoPostal) &&
                Objects.equals(idRuttraCrea, that.idRuttraCrea) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(idRuttraMod, that.idRuttraMod) &&
                Objects.equals(fechaModifica, that.fechaModifica) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDireccion, idTipodirFk, calle, numero, idComunaFk, poblacion, blocks, departamento, sector, codigoPostal, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
