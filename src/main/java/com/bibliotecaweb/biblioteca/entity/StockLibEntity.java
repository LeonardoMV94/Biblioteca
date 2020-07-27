package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock_lib", schema = "biblioteca", catalog = "")
public class StockLibEntity {
    private Integer idStock;
    private Integer idCodBarralib;
    private Integer cantLib;

    @Id
    @Column(name = "ID_STOCK")
    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
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
        StockLibEntity that = (StockLibEntity) o;
        return Objects.equals(idStock, that.idStock) &&
                Objects.equals(idCodBarralib, that.idCodBarralib) &&
                Objects.equals(cantLib, that.cantLib);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idStock, idCodBarralib, cantLib);
    }
}
