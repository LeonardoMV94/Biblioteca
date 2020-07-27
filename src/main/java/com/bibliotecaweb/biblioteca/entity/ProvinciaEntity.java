package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "provincia", schema = "biblioteca", catalog = "")
public class ProvinciaEntity {
    private Integer idProvincia;
    private String nombreProv;
    private Integer idRegionFk;

    @Id
    @Column(name = "ID_PROVINCIA")
    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Basic
    @Column(name = "NOMBRE_PROV")
    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    @Basic
    @Column(name = "ID_REGION_FK")
    public Integer getIdRegionFk() {
        return idRegionFk;
    }

    public void setIdRegionFk(Integer idRegionFk) {
        this.idRegionFk = idRegionFk;
    }

    @OneToMany


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProvinciaEntity that = (ProvinciaEntity) o;
        return Objects.equals(idProvincia, that.idProvincia) &&
                Objects.equals(nombreProv, that.nombreProv) &&
                Objects.equals(idRegionFk, that.idRegionFk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProvincia, nombreProv, idRegionFk);
    }
}
