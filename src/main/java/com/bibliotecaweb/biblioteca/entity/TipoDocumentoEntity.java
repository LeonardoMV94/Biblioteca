package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipo_documento", schema = "biblioteca", catalog = "")
public class TipoDocumentoEntity {
    private Integer idTipodoc;
    private String descricpionTipodoc;

    @Id
    @Column(name = "ID_TIPODOC")
    public Integer getIdTipodoc() {
        return idTipodoc;
    }

    public void setIdTipodoc(Integer idTipodoc) {
        this.idTipodoc = idTipodoc;
    }

    @Basic
    @Column(name = "DESCRICPION_TIPODOC")
    public String getDescricpionTipodoc() {
        return descricpionTipodoc;
    }

    public void setDescricpionTipodoc(String descricpionTipodoc) {
        this.descricpionTipodoc = descricpionTipodoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoDocumentoEntity that = (TipoDocumentoEntity) o;
        return Objects.equals(idTipodoc, that.idTipodoc) &&
                Objects.equals(descricpionTipodoc, that.descricpionTipodoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipodoc, descricpionTipodoc);
    }
}
