package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "forma_pago", schema = "biblioteca", catalog = "")
public class FormaPagoEntity {
    private Integer idFormaPago;
    private String descripcion;

    @Id
    @Column(name = "ID_FORMA_PAGO")
    public Integer getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(Integer idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    @Basic
    @Column(name = "DESCRIPCION")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormaPagoEntity that = (FormaPagoEntity) o;
        return Objects.equals(idFormaPago, that.idFormaPago) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFormaPago, descripcion);
    }
}
