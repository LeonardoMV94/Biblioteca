package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comuna", schema = "biblioteca", catalog = "")
public class ComunaEntity {
    private Integer idComuna;
    private String nombreComu;
    private Integer idProvinciaFk;

    @Id
    @Column(name = "ID_COMUNA")
    public Integer getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Integer idComuna) {
        this.idComuna = idComuna;
    }

    @Basic
    @Column(name = "NOMBRE_COMU")
    public String getNombreComu() {
        return nombreComu;
    }

    public void setNombreComu(String nombreComu) {
        this.nombreComu = nombreComu;
    }

    @Basic
    @Column(name = "ID_PROVINCIA_FK")
    public Integer getIdProvinciaFk() {
        return idProvinciaFk;
    }

    public void setIdProvinciaFk(Integer idProvinciaFk) {
        this.idProvinciaFk = idProvinciaFk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComunaEntity that = (ComunaEntity) o;
        return Objects.equals(idComuna, that.idComuna) &&
                Objects.equals(nombreComu, that.nombreComu) &&
                Objects.equals(idProvinciaFk, that.idProvinciaFk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComuna, nombreComu, idProvinciaFk);
    }
}
