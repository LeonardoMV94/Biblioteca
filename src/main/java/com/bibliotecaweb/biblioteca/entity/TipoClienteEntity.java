package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipo_cliente", schema = "biblioteca", catalog = "")
public class TipoClienteEntity {
    private Integer idTipocli;
    private String descripcionTipocli;

    @Id
    @Column(name = "ID_TIPOCLI")
    public Integer getIdTipocli() {
        return idTipocli;
    }

    public void setIdTipocli(Integer idTipocli) {
        this.idTipocli = idTipocli;
    }

    @Basic
    @Column(name = "DESCRIPCION_TIPOCLI")
    public String getDescripcionTipocli() {
        return descripcionTipocli;
    }

    public void setDescripcionTipocli(String descripcionTipocli) {
        this.descripcionTipocli = descripcionTipocli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoClienteEntity that = (TipoClienteEntity) o;
        return Objects.equals(idTipocli, that.idTipocli) &&
                Objects.equals(descripcionTipocli, that.descripcionTipocli);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipocli, descripcionTipocli);
    }
}
