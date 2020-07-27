package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "idiomas", schema = "biblioteca", catalog = "")
public class IdiomasEntity {
    private Integer idIdioma;
    private String idioma;

    @Id
    @Column(name = "ID_IDIOMA")
    public Integer getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    @Basic
    @Column(name = "IDIOMA")
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdiomasEntity that = (IdiomasEntity) o;
        return Objects.equals(idIdioma, that.idIdioma) &&
                Objects.equals(idioma, that.idioma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIdioma, idioma);
    }
}
