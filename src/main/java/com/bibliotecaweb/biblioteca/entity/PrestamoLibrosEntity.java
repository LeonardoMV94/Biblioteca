package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "prestamo_libros", schema = "biblioteca", catalog = "")
public class PrestamoLibrosEntity {
    private Integer idPrestamo;
    private Date fechaPrestamo;
    private Integer idRutcli;
    private Integer idRuttra;
    private Integer subtotalPrestamo;
    private Integer iva;
    private Integer totalPrestamo;

    @Id
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
    @Column(name = "ID_RUTCLI")
    public Integer getIdRutcli() {
        return idRutcli;
    }

    public void setIdRutcli(Integer idRutcli) {
        this.idRutcli = idRutcli;
    }

    @Basic
    @Column(name = "ID_RUTTRA")
    public Integer getIdRuttra() {
        return idRuttra;
    }

    public void setIdRuttra(Integer idRuttra) {
        this.idRuttra = idRuttra;
    }

    @Basic
    @Column(name = "SUBTOTAL_PRESTAMO")
    public Integer getSubtotalPrestamo() {
        return subtotalPrestamo;
    }

    public void setSubtotalPrestamo(Integer subtotalPrestamo) {
        this.subtotalPrestamo = subtotalPrestamo;
    }

    @Basic
    @Column(name = "IVA")
    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    @Basic
    @Column(name = "TOTAL_PRESTAMO")
    public Integer getTotalPrestamo() {
        return totalPrestamo;
    }

    public void setTotalPrestamo(Integer totalPrestamo) {
        this.totalPrestamo = totalPrestamo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrestamoLibrosEntity that = (PrestamoLibrosEntity) o;
        return Objects.equals(idPrestamo, that.idPrestamo) &&
                Objects.equals(fechaPrestamo, that.fechaPrestamo) &&
                Objects.equals(idRutcli, that.idRutcli) &&
                Objects.equals(idRuttra, that.idRuttra) &&
                Objects.equals(subtotalPrestamo, that.subtotalPrestamo) &&
                Objects.equals(iva, that.iva) &&
                Objects.equals(totalPrestamo, that.totalPrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrestamo, fechaPrestamo, idRutcli, idRuttra, subtotalPrestamo, iva, totalPrestamo);
    }
}
