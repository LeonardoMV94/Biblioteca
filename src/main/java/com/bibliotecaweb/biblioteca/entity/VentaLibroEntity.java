package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "venta_libro", schema = "biblioteca", catalog = "")
public class VentaLibroEntity {
    private Integer idVenta;
    private Integer idTipodoc;
    private Date fechaVenta;
    private Integer idRuttra;
    private Integer idCliente;
    private Integer subtotal;
    private Integer iva;
    private Integer totalVenta;

    @Id
    @Column(name = "ID_VENTA")
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    @Basic
    @Column(name = "ID_TIPODOC")
    public Integer getIdTipodoc() {
        return idTipodoc;
    }

    public void setIdTipodoc(Integer idTipodoc) {
        this.idTipodoc = idTipodoc;
    }

    @Basic
    @Column(name = "FECHA_VENTA")
    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
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
    @Column(name = "ID_CLIENTE")
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "SUBTOTAL")
    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
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
    @Column(name = "TOTAL_VENTA")
    public Integer getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Integer totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VentaLibroEntity that = (VentaLibroEntity) o;
        return Objects.equals(idVenta, that.idVenta) &&
                Objects.equals(idTipodoc, that.idTipodoc) &&
                Objects.equals(fechaVenta, that.fechaVenta) &&
                Objects.equals(idRuttra, that.idRuttra) &&
                Objects.equals(idCliente, that.idCliente) &&
                Objects.equals(subtotal, that.subtotal) &&
                Objects.equals(iva, that.iva) &&
                Objects.equals(totalVenta, that.totalVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVenta, idTipodoc, fechaVenta, idRuttra, idCliente, subtotal, iva, totalVenta);
    }
}
