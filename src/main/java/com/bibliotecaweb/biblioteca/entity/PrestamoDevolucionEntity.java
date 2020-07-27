package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "prestamo_devolucion", schema = "biblioteca", catalog = "")
public class PrestamoDevolucionEntity {
    private Integer idPrestamoDevolucion;
    private Integer idRutcli;
    private Integer idPrestamo;
    private Date fechaPrestamo;
    private Date fechaEntregaReal;
    private Integer diasRetreso;
    private Integer valorPrestamo;
    private Integer multa;
    private Integer costoFinalPrestamo;

    @Id
    @Column(name = "ID_PRESTAMO_DEVOLUCION")
    public Integer getIdPrestamoDevolucion() {
        return idPrestamoDevolucion;
    }

    public void setIdPrestamoDevolucion(Integer idPrestamoDevolucion) {
        this.idPrestamoDevolucion = idPrestamoDevolucion;
    }

    @Basic
    @Column(name = "ID_RUTCLI")
    public Integer getIdRutcli() {
        return idRutcli;
    }

    public void setIdRutcli(Integer idRutcli) {
        this.idRutcli = idRutcli;
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
    @Column(name = "FECHA_PRESTAMO")
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Basic
    @Column(name = "FECHA_ENTREGA_REAL")
    public Date getFechaEntregaReal() {
        return fechaEntregaReal;
    }

    public void setFechaEntregaReal(Date fechaEntregaReal) {
        this.fechaEntregaReal = fechaEntregaReal;
    }

    @Basic
    @Column(name = "DIAS_RETRESO")
    public Integer getDiasRetreso() {
        return diasRetreso;
    }

    public void setDiasRetreso(Integer diasRetreso) {
        this.diasRetreso = diasRetreso;
    }

    @Basic
    @Column(name = "VALOR_PRESTAMO")
    public Integer getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(Integer valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

    @Basic
    @Column(name = "MULTA")
    public Integer getMulta() {
        return multa;
    }

    public void setMulta(Integer multa) {
        this.multa = multa;
    }

    @Basic
    @Column(name = "COSTO_FINAL_PRESTAMO")
    public Integer getCostoFinalPrestamo() {
        return costoFinalPrestamo;
    }

    public void setCostoFinalPrestamo(Integer costoFinalPrestamo) {
        this.costoFinalPrestamo = costoFinalPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestamoDevolucionEntity that = (PrestamoDevolucionEntity) o;
        return Objects.equals(idPrestamoDevolucion, that.idPrestamoDevolucion) &&
                Objects.equals(idRutcli, that.idRutcli) &&
                Objects.equals(idPrestamo, that.idPrestamo) &&
                Objects.equals(fechaPrestamo, that.fechaPrestamo) &&
                Objects.equals(fechaEntregaReal, that.fechaEntregaReal) &&
                Objects.equals(diasRetreso, that.diasRetreso) &&
                Objects.equals(valorPrestamo, that.valorPrestamo) &&
                Objects.equals(multa, that.multa) &&
                Objects.equals(costoFinalPrestamo, that.costoFinalPrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrestamoDevolucion, idRutcli, idPrestamo, fechaPrestamo, fechaEntregaReal, diasRetreso, valorPrestamo, multa, costoFinalPrestamo);
    }
}
