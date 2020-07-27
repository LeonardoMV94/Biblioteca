package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "clientes", schema = "biblioteca", catalog = "")
public class ClientesEntity {
    private Integer idRutcli;
    private String nomCli;
    private String paternoCli;
    private String maternoCli;
    private Integer idTipoCli;
    private Integer idEstadoCivil;
    private String razonsocialCli;
    private Integer idActivEcono;
    private String nomRlegalCli;
    private String patRlegalCli;
    private String matRlegalCli;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RUTCLI")
    public Integer getIdRutcli() {
        return idRutcli;
    }

    public void setIdRutcli(Integer idRutcli) {
        this.idRutcli = idRutcli;
    }

    @Basic
    @Column(name = "NOM_CLI")
    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    @Basic
    @Column(name = "PATERNO_CLI")
    public String getPaternoCli() {
        return paternoCli;
    }

    public void setPaternoCli(String paternoCli) {
        this.paternoCli = paternoCli;
    }

    @Basic
    @Column(name = "MATERNO_CLI")
    public String getMaternoCli() {
        return maternoCli;
    }

    public void setMaternoCli(String maternoCli) {
        this.maternoCli = maternoCli;
    }

    @Basic
    @Column(name = "ID_TIPO_CLI")
    public Integer getIdTipoCli() {
        return idTipoCli;
    }

    public void setIdTipoCli(Integer idTipoCli) {
        this.idTipoCli = idTipoCli;
    }

    @Basic
    @Column(name = "ID_ESTADO_CIVIL")
    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    @Basic
    @Column(name = "RAZONSOCIAL_CLI")
    public String getRazonsocialCli() {
        return razonsocialCli;
    }

    public void setRazonsocialCli(String razonsocialCli) {
        this.razonsocialCli = razonsocialCli;
    }

    @Basic
    @Column(name = "ID_ACTIV_ECONO")
    public Integer getIdActivEcono() {
        return idActivEcono;
    }

    public void setIdActivEcono(Integer idActivEcono) {
        this.idActivEcono = idActivEcono;
    }

    @Basic
    @Column(name = "NOM_RLEGAL_CLI")
    public String getNomRlegalCli() {
        return nomRlegalCli;
    }

    public void setNomRlegalCli(String nomRlegalCli) {
        this.nomRlegalCli = nomRlegalCli;
    }

    @Basic
    @Column(name = "PAT_RLEGAL_CLI")
    public String getPatRlegalCli() {
        return patRlegalCli;
    }

    public void setPatRlegalCli(String patRlegalCli) {
        this.patRlegalCli = patRlegalCli;
    }

    @Basic
    @Column(name = "MAT_RLEGAL_CLI")
    public String getMatRlegalCli() {
        return matRlegalCli;
    }

    public void setMatRlegalCli(String matRlegalCli) {
        this.matRlegalCli = matRlegalCli;
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
        ClientesEntity that = (ClientesEntity) o;
        return Objects.equals(idRutcli, that.idRutcli) &&
                Objects.equals(nomCli, that.nomCli) &&
                Objects.equals(paternoCli, that.paternoCli) &&
                Objects.equals(maternoCli, that.maternoCli) &&
                Objects.equals(idTipoCli, that.idTipoCli) &&
                Objects.equals(idEstadoCivil, that.idEstadoCivil) &&
                Objects.equals(razonsocialCli, that.razonsocialCli) &&
                Objects.equals(idActivEcono, that.idActivEcono) &&
                Objects.equals(nomRlegalCli, that.nomRlegalCli) &&
                Objects.equals(patRlegalCli, that.patRlegalCli) &&
                Objects.equals(matRlegalCli, that.matRlegalCli) &&
                Objects.equals(idRuttraCrea, that.idRuttraCrea) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(idRuttraMod, that.idRuttraMod) &&
                Objects.equals(fechaModifica, that.fechaModifica) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRutcli, nomCli, paternoCli, maternoCli, idTipoCli, idEstadoCivil, razonsocialCli, idActivEcono, nomRlegalCli, patRlegalCli, matRlegalCli, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
