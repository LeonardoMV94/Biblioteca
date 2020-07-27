package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock_lib_prestamo", schema = "biblioteca", catalog = "")
public class StockLibPrestamoEntity {
    private Integer idStockPrestamo;
    private Integer idCodBarralib;
    private Integer cantLib;

    @Id
    @Column(name = "ID_STOCK_PRESTAMO")
    public Integer getIdStockPrestamo() {
        return idStockPrestamo;
    }

    public void setIdStockPrestamo(Integer idStockPrestamo) {
        this.idStockPrestamo = idStockPrestamo;
    }

    @Basic
    @Column(name = "ID_COD_BARRALIB")
    public Integer getIdCodBarralib() {
        return idCodBarralib;
    }

    public void setIdCodBarralib(Integer idCodBarralib) {
        this.idCodBarralib = idCodBarralib;
    }

    @Basic
    @Column(name = "CANT_LIB")
    public Integer getCantLib() {
        return cantLib;
    }

    public void setCantLib(Integer cantLib) {
        this.cantLib = cantLib;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockLibPrestamoEntity that = (StockLibPrestamoEntity) o;
        return Objects.equals(idStockPrestamo, that.idStockPrestamo) &&
                Objects.equals(idCodBarralib, that.idCodBarralib) &&
                Objects.equals(cantLib, that.cantLib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStockPrestamo, idCodBarralib, cantLib);
    }
}
