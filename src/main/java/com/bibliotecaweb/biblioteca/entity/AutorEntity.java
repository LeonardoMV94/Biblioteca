package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "autor", schema = "biblioteca", catalog = "")
public class AutorEntity {
    private Integer idAutor;
    private String nombreAut;
    private String paternoAut;
    private String maternoAut;

    @Id
    @Column(name = "ID_AUTOR")
    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    @Basic
    @Column(name = "NOMBRE_AUT")
    public String getNombreAut() {
        return nombreAut;
    }

    public void setNombreAut(String nombreAut) {
        this.nombreAut = nombreAut;
    }

    @Basic
    @Column(name = "PATERNO_AUT")
    public String getPaternoAut() {
        return paternoAut;
    }

    public void setPaternoAut(String paternoAut) {
        this.paternoAut = paternoAut;
    }

    @Basic
    @Column(name = "MATERNO_AUT")
    public String getMaternoAut() {
        return maternoAut;
    }

    public void setMaternoAut(String maternoAut) {
        this.maternoAut = maternoAut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutorEntity that = (AutorEntity) o;
        return Objects.equals(idAutor, that.idAutor) &&
                Objects.equals(nombreAut, that.nombreAut) &&
                Objects.equals(paternoAut, that.paternoAut) &&
                Objects.equals(maternoAut, that.maternoAut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutor, nombreAut, paternoAut, maternoAut);
    }
}
