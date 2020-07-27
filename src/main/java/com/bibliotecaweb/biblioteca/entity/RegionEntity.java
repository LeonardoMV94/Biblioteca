package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "region", schema = "biblioteca", catalog = "")
public class RegionEntity {
    private Integer idRegion;
    private String nombreReg;
    private String numeroReg;

    @Id
    @Column(name = "ID_REGION")
    public Integer getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Integer idRegion) {
        this.idRegion = idRegion;
    }

    @Basic
    @Column(name = "NOMBRE_REG")
    public String getNombreReg() {
        return nombreReg;
    }

    public void setNombreReg(String nombreReg) {
        this.nombreReg = nombreReg;
    }

    @Basic
    @Column(name = "NUMERO_REG")
    public String getNumeroReg() {
        return numeroReg;
    }

    public void setNumeroReg(String numeroReg) {
        this.numeroReg = numeroReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionEntity that = (RegionEntity) o;
        return Objects.equals(idRegion, that.idRegion) &&
                Objects.equals(nombreReg, that.nombreReg) &&
                Objects.equals(numeroReg, that.numeroReg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRegion, nombreReg, numeroReg);
    }
}
