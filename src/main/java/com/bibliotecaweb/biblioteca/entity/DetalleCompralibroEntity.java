package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalle_compralibro", schema = "biblioteca", catalog = "")
public class DetalleCompralibroEntity {
    private Integer idDetalleCompra;
    private Integer idCompraFk;
    private Integer codBarraLib;
    private Integer cantidadUni;
    private Integer valornetoUni;
    private Boolean descuentoUni;
    private Integer totalUni;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE_COMPRA")
    public Integer getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(Integer idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    @Basic
    @Column(name = "ID_COMPRA_FK")
    public Integer getIdCompraFk() {
        return idCompraFk;
    }

    public void setIdCompraFk(Integer idCompraFk) {
        this.idCompraFk = idCompraFk;
    }

    @Basic
    @Column(name = "COD_BARRA_LIB")
    public Integer getCodBarraLib() {
        return codBarraLib;
    }

    public void setCodBarraLib(Integer codBarraLib) {
        this.codBarraLib = codBarraLib;
    }

    @Basic
    @Column(name = "CANTIDAD_UNI")
    public Integer getCantidadUni() {
        return cantidadUni;
    }

    public void setCantidadUni(Integer cantidadUni) {
        this.cantidadUni = cantidadUni;
    }

    @Basic
    @Column(name = "VALORNETO_UNI")
    public Integer getValornetoUni() {
        return valornetoUni;
    }

    public void setValornetoUni(Integer valornetoUni) {
        this.valornetoUni = valornetoUni;
    }

    @Basic
    @Column(name = "DESCUENTO_UNI")
    public Boolean getDescuentoUni() {
        return descuentoUni;
    }

    public void setDescuentoUni(Boolean descuentoUni) {
        this.descuentoUni = descuentoUni;
    }

    @Basic
    @Column(name = "TOTAL_UNI")
    public Integer getTotalUni() {
        return totalUni;
    }

    public void setTotalUni(Integer totalUni) {
        this.totalUni = totalUni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleCompralibroEntity that = (DetalleCompralibroEntity) o;
        return Objects.equals(idDetalleCompra, that.idDetalleCompra) &&
                Objects.equals(idCompraFk, that.idCompraFk) &&
                Objects.equals(codBarraLib, that.codBarraLib) &&
                Objects.equals(cantidadUni, that.cantidadUni) &&
                Objects.equals(valornetoUni, that.valornetoUni) &&
                Objects.equals(descuentoUni, that.descuentoUni) &&
                Objects.equals(totalUni, that.totalUni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetalleCompra, idCompraFk, codBarraLib, cantidadUni, valornetoUni, descuentoUni, totalUni);
    }
}
