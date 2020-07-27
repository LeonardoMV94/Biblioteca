package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "trabajadores", schema = "biblioteca", catalog = "")
public class TrabajadoresEntity {
    private Integer idRuttra;
    private String nomTrab;
    private String patTrab;
    private String matTrab;
    private Date fecnacTrab;
    private Integer idSexoTrab;
    private Integer idCargoTrab;
    private Integer sexualidadTrab;
    private Integer idEcivilFk;
    private Integer idPaisTrabFk;
    private Date fechaContrato;
    private Date fechaFincont;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @Column(name = "ID_RUTTRA")
    public Integer getIdRuttra() {
        return idRuttra;
    }

    public void setIdRuttra(Integer idRuttra) {
        this.idRuttra = idRuttra;
    }

    @Basic
    @Column(name = "NOM_TRAB")
    public String getNomTrab() {
        return nomTrab;
    }

    public void setNomTrab(String nomTrab) {
        this.nomTrab = nomTrab;
    }

    @Basic
    @Column(name = "PAT_TRAB")
    public String getPatTrab() {
        return patTrab;
    }

    public void setPatTrab(String patTrab) {
        this.patTrab = patTrab;
    }

    @Basic
    @Column(name = "MAT_TRAB")
    public String getMatTrab() {
        return matTrab;
    }

    public void setMatTrab(String matTrab) {
        this.matTrab = matTrab;
    }

    @Basic
    @Column(name = "FECNAC_TRAB")
    public Date getFecnacTrab() {
        return fecnacTrab;
    }

    public void setFecnacTrab(Date fecnacTrab) {
        this.fecnacTrab = fecnacTrab;
    }

    @Basic
    @Column(name = "ID_SEXO_TRAB")
    public Integer getIdSexoTrab() {
        return idSexoTrab;
    }

    public void setIdSexoTrab(Integer idSexoTrab) {
        this.idSexoTrab = idSexoTrab;
    }

    @Basic
    @Column(name = "ID_CARGO_TRAB")
    public Integer getIdCargoTrab() {
        return idCargoTrab;
    }

    public void setIdCargoTrab(Integer idCargoTrab) {
        this.idCargoTrab = idCargoTrab;
    }

    @Basic
    @Column(name = "SEXUALIDAD_TRAB")
    public Integer getSexualidadTrab() {
        return sexualidadTrab;
    }

    public void setSexualidadTrab(Integer sexualidadTrab) {
        this.sexualidadTrab = sexualidadTrab;
    }

    @Basic
    @Column(name = "ID_ECIVIL_FK")
    public Integer getIdEcivilFk() {
        return idEcivilFk;
    }

    public void setIdEcivilFk(Integer idEcivilFk) {
        this.idEcivilFk = idEcivilFk;
    }

    @Basic
    @Column(name = "ID_PAIS_TRAB_FK")
    public Integer getIdPaisTrabFk() {
        return idPaisTrabFk;
    }

    public void setIdPaisTrabFk(Integer idPaisTrabFk) {
        this.idPaisTrabFk = idPaisTrabFk;
    }

    @Basic
    @Column(name = "FECHA_CONTRATO")
    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Basic
    @Column(name = "FECHA_FINCONT")
    public Date getFechaFincont() {
        return fechaFincont;
    }

    public void setFechaFincont(Date fechaFincont) {
        this.fechaFincont = fechaFincont;
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
        TrabajadoresEntity that = (TrabajadoresEntity) o;
        return Objects.equals(idRuttra, that.idRuttra) &&
                Objects.equals(nomTrab, that.nomTrab) &&
                Objects.equals(patTrab, that.patTrab) &&
                Objects.equals(matTrab, that.matTrab) &&
                Objects.equals(fecnacTrab, that.fecnacTrab) &&
                Objects.equals(idSexoTrab, that.idSexoTrab) &&
                Objects.equals(idCargoTrab, that.idCargoTrab) &&
                Objects.equals(sexualidadTrab, that.sexualidadTrab) &&
                Objects.equals(idEcivilFk, that.idEcivilFk) &&
                Objects.equals(idPaisTrabFk, that.idPaisTrabFk) &&
                Objects.equals(fechaContrato, that.fechaContrato) &&
                Objects.equals(fechaFincont, that.fechaFincont) &&
                Objects.equals(idRuttraCrea, that.idRuttraCrea) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(idRuttraMod, that.idRuttraMod) &&
                Objects.equals(fechaModifica, that.fechaModifica) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRuttra, nomTrab, patTrab, matTrab, fecnacTrab, idSexoTrab, idCargoTrab, sexualidadTrab, idEcivilFk, idPaisTrabFk, fechaContrato, fechaFincont, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
