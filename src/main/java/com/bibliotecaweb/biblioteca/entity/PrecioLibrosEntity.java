package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "precio_libros", schema = "biblioteca", catalog = "")
public class PrecioLibrosEntity {
    private Integer idPrecLib;
    private Integer idCodBarra;
    private Integer valUltComp;
    private Integer valorPromComp;
    private Integer valorAntecomp;
    private Integer precioArriendoDiario;
    private Integer precioventa;

    @Id
    @Column(name = "ID_PREC_LIB")
    public Integer getIdPrecLib() {
        return idPrecLib;
    }

    public void setIdPrecLib(Integer idPrecLib) {
        this.idPrecLib = idPrecLib;
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
    @Column(name = "VAL_ULT_COMP")
    public Integer getValUltComp() {
        return valUltComp;
    }

    public void setValUltComp(Integer valUltComp) {
        this.valUltComp = valUltComp;
    }

    @Basic
    @Column(name = "VALOR_PROM_COMP")
    public Integer getValorPromComp() {
        return valorPromComp;
    }

    public void setValorPromComp(Integer valorPromComp) {
        this.valorPromComp = valorPromComp;
    }

    @Basic
    @Column(name = "VALOR_ANTECOMP")
    public Integer getValorAntecomp() {
        return valorAntecomp;
    }

    public void setValorAntecomp(Integer valorAntecomp) {
        this.valorAntecomp = valorAntecomp;
    }

    @Basic
    @Column(name = "PRECIO_ARRIENDO_DIARIO")
    public Integer getPrecioArriendoDiario() {
        return precioArriendoDiario;
    }

    public void setPrecioArriendoDiario(Integer precioArriendoDiario) {
        this.precioArriendoDiario = precioArriendoDiario;
    }

    @Basic
    @Column(name = "PRECIOVENTA")
    public Integer getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Integer precioventa) {
        this.precioventa = precioventa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrecioLibrosEntity that = (PrecioLibrosEntity) o;
        return Objects.equals(idPrecLib, that.idPrecLib) &&
                Objects.equals(idCodBarra, that.idCodBarra) &&
                Objects.equals(valUltComp, that.valUltComp) &&
                Objects.equals(valorPromComp, that.valorPromComp) &&
                Objects.equals(valorAntecomp, that.valorAntecomp) &&
                Objects.equals(precioArriendoDiario, that.precioArriendoDiario) &&
                Objects.equals(precioventa, that.precioventa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPrecLib, idCodBarra, valUltComp, valorPromComp, valorAntecomp, precioArriendoDiario, precioventa);
    }
}
