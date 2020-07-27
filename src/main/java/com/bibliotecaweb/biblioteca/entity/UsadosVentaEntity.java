package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "usados_venta", schema = "biblioteca", catalog = "")
public class UsadosVentaEntity {
    private Integer idUsadovta;
    private Integer idCodBarra;
    private Integer idCopialib;
    private Integer idEstadoLibUsa;
    private Date fechaBaja;
    private Integer idRuttra;

    @Id
    @Column(name = "ID_USADOVTA")
    public Integer getIdUsadovta() {
        return idUsadovta;
    }

    public void setIdUsadovta(Integer idUsadovta) {
        this.idUsadovta = idUsadovta;
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
    @Column(name = "ID_COPIALIB")
    public Integer getIdCopialib() {
        return idCopialib;
    }

    public void setIdCopialib(Integer idCopialib) {
        this.idCopialib = idCopialib;
    }

    @Basic
    @Column(name = "ID_ESTADO_LIB_USA")
    public Integer getIdEstadoLibUsa() {
        return idEstadoLibUsa;
    }

    public void setIdEstadoLibUsa(Integer idEstadoLibUsa) {
        this.idEstadoLibUsa = idEstadoLibUsa;
    }

    @Basic
    @Column(name = "FECHA_BAJA")
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Basic
    @Column(name = "ID_RUTTRA")
    public Integer getIdRuttra() {
        return idRuttra;
    }

    public void setIdRuttra(Integer idRuttra) {
        this.idRuttra = idRuttra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsadosVentaEntity that = (UsadosVentaEntity) o;
        return Objects.equals(idUsadovta, that.idUsadovta) &&
                Objects.equals(idCodBarra, that.idCodBarra) &&
                Objects.equals(idCopialib, that.idCopialib) &&
                Objects.equals(idEstadoLibUsa, that.idEstadoLibUsa) &&
                Objects.equals(fechaBaja, that.fechaBaja) &&
                Objects.equals(idRuttra, that.idRuttra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsadovta, idCodBarra, idCopialib, idEstadoLibUsa, fechaBaja, idRuttra);
    }
}
