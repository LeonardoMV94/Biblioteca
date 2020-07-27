package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sexo", schema = "biblioteca", catalog = "")
public class SexoEntity {
    private Integer idSexo;
    private String descripcionSexo;

    @Id
    @Column(name = "ID_SEXO")
    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    @Basic
    @Column(name = "DESCRIPCION_SEXO")
    public String getDescripcionSexo() {
        return descripcionSexo;
    }

    public void setDescripcionSexo(String descripcionSexo) {
        this.descripcionSexo = descripcionSexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexoEntity that = (SexoEntity) o;
        return Objects.equals(idSexo, that.idSexo) &&
                Objects.equals(descripcionSexo, that.descripcionSexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSexo, descripcionSexo);
    }
}
