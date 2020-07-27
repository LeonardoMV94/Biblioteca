package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "proveedor", schema = "biblioteca", catalog = "")
public class ProveedorEntity {
    private Integer idRutprov;
    private String nomPro;
    private String patProv;
    private String matProv;
    private Integer tipoProv;
    private String website;
    private String razonsocialProv;
    private Integer idActecoFk;
    private String nomRlegalCli;
    private String patRlegalCli;
    private String matRlegalCli;
    private Integer idRuttraCrea;
    private Timestamp fechaCreacion;
    private Integer idRuttraMod;
    private Timestamp fechaModifica;
    private Byte estado;

    @Id
    @Column(name = "ID_RUTPROV")
    public Integer getIdRutprov() {
        return idRutprov;
    }

    public void setIdRutprov(Integer idRutprov) {
        this.idRutprov = idRutprov;
    }

    @Basic
    @Column(name = "NOM_PRO")
    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    @Basic
    @Column(name = "PAT_PROV")
    public String getPatProv() {
        return patProv;
    }

    public void setPatProv(String patProv) {
        this.patProv = patProv;
    }

    @Basic
    @Column(name = "MAT_PROV")
    public String getMatProv() {
        return matProv;
    }

    public void setMatProv(String matProv) {
        this.matProv = matProv;
    }

    @Basic
    @Column(name = "TIPO_PROV")
    public Integer getTipoProv() {
        return tipoProv;
    }

    public void setTipoProv(Integer tipoProv) {
        this.tipoProv = tipoProv;
    }

    @Basic
    @Column(name = "WEBSITE")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Basic
    @Column(name = "RAZONSOCIAL_PROV")
    public String getRazonsocialProv() {
        return razonsocialProv;
    }

    public void setRazonsocialProv(String razonsocialProv) {
        this.razonsocialProv = razonsocialProv;
    }

    @Basic
    @Column(name = "ID_ACTECO_FK")
    public Integer getIdActecoFk() {
        return idActecoFk;
    }

    public void setIdActecoFk(Integer idActecoFk) {
        this.idActecoFk = idActecoFk;
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
        ProveedorEntity that = (ProveedorEntity) o;
        return Objects.equals(idRutprov, that.idRutprov) &&
                Objects.equals(nomPro, that.nomPro) &&
                Objects.equals(patProv, that.patProv) &&
                Objects.equals(matProv, that.matProv) &&
                Objects.equals(tipoProv, that.tipoProv) &&
                Objects.equals(website, that.website) &&
                Objects.equals(razonsocialProv, that.razonsocialProv) &&
                Objects.equals(idActecoFk, that.idActecoFk) &&
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
        return Objects.hash(idRutprov, nomPro, patProv, matProv, tipoProv, website, razonsocialProv, idActecoFk, nomRlegalCli, patRlegalCli, matRlegalCli, idRuttraCrea, fechaCreacion, idRuttraMod, fechaModifica, estado);
    }
}
