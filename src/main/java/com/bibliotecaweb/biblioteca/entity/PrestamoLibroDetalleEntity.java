package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "prestamo_libro_detalle", schema = "biblioteca", catalog = "")
public class PrestamoLibroDetalleEntity {
    private Integer idDetallePrestamo;
    private Integer idPrestamo;
    private Integer idCodBarra;
    private Integer idCopialib;
    private Integer valorPrestamoLibro;

    @Id
    @Column(name = "ID_DETALLE_PRESTAMO")
    public Integer getIdDetallePrestamo() {
        return idDetallePrestamo;
    }

    public void setIdDetallePrestamo(Integer idDetallePrestamo) {
        this.idDetallePrestamo = idDetallePrestamo;
    }

    @Basic
    @Column(name = "ID_PRESTAMO")
    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    @Basic
    @Column(name = "ID_COD_BARRA")
    public Integer getIdCodBarra() {
        return idCodBarra;
    }

    public void setIdCodBarra(Integer idCodBarra) {
        this.idCodBarra = idCodBarra;
    }

    @Basic
    @Column(name = "ID_COPIALIB")
    public Integer getIdCopialib() {
        return idCopialib;
    }

    public void setIdCopialib(Integer idCopialib) {
        this.idCopialib = idCopialib;
    }

    @Basic
    @Column(name = "VALOR_PRESTAMO_LIBRO")
    public Integer getValorPrestamoLibro() {
        return valorPrestamoLibro;
    }

    public void setValorPrestamoLibro(Integer valorPrestamoLibro) {
        this.valorPrestamoLibro = valorPrestamoLibro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestamoLibroDetalleEntity that = (PrestamoLibroDetalleEntity) o;
        return Objects.equals(idDetallePrestamo, that.idDetallePrestamo) &&
                Objects.equals(idPrestamo, that.idPrestamo) &&
                Objects.equals(idCodBarra, that.idCodBarra) &&
                Objects.equals(idCopialib, that.idCopialib) &&
                Objects.equals(valorPrestamoLibro, that.valorPrestamoLibro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetallePrestamo, idPrestamo, idCodBarra, idCopialib, valorPrestamoLibro);
    }
}
