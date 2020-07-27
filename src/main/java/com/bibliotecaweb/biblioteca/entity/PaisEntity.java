package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pais", schema = "biblioteca", catalog = "")
public class PaisEntity {
    private Integer idPais;
    private String nombrePais;
    private String nacionalidadPais;

    @Id
    @Column(name = "ID_PAIS")
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    @Basic
    @Column(name = "NOMBRE_PAIS")
    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Basic
    @Column(name = "NACIONALIDAD_PAIS")
    public String getNacionalidadPais() {
        return nacionalidadPais;
    }

    public void setNacionalidadPais(String nacionalidadPais) {
        this.nacionalidadPais = nacionalidadPais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaisEntity that = (PaisEntity) o;
        return Objects.equals(idPais, that.idPais) &&
                Objects.equals(nombrePais, that.nombrePais) &&
                Objects.equals(nacionalidadPais, that.nacionalidadPais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPais, nombrePais, nacionalidadPais);
    }
}
