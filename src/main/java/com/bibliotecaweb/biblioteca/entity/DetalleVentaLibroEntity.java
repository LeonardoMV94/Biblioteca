package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalle_venta_libro", schema = "biblioteca", catalog = "")
public class DetalleVentaLibroEntity {
    private Integer idDetalle;
    private Integer idVentaFk;
    private Integer idCodBarraLib;
    private Integer idTipoLib;
    private Integer idUsadovta;
    private Integer cantidad;
    private Integer netoDetvta;
    private Integer ivaDetvta;
    private Integer valorDetvta;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DETALLE")
    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    @Basic
    @Column(name = "ID_VENTA_FK")
    public Integer getIdVentaFk() {
        return idVentaFk;
    }

    public void setIdVentaFk(Integer idVentaFk) {
        this.idVentaFk = idVentaFk;
    }

    @Basic
    @Column(name = "ID_COD_BARRA_LIB")
    public Integer getIdCodBarraLib() {
        return idCodBarraLib;
    }

    public void setIdCodBarraLib(Integer idCodBarraLib) {
        this.idCodBarraLib = idCodBarraLib;
    }

    @Basic
    @Column(name = "ID_TIPO_LIB")
    public Integer getIdTipoLib() {
        return idTipoLib;
    }

    public void setIdTipoLib(Integer idTipoLib) {
        this.idTipoLib = idTipoLib;
    }

    @Basic
    @Column(name = "ID_USADOVTA")
    public Integer getIdUsadovta() {
        return idUsadovta;
    }

    public void setIdUsadovta(Integer idUsadovta) {
        this.idUsadovta = idUsadovta;
    }

    @Basic
    @Column(name = "CANTIDAD")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Basic
    @Column(name = "NETO_DETVTA")
    public Integer getNetoDetvta() {
        return netoDetvta;
    }

    public void setNetoDetvta(Integer netoDetvta) {
        this.netoDetvta = netoDetvta;
    }

    @Basic
    @Column(name = "IVA_DETVTA")
    public Integer getIvaDetvta() {
        return ivaDetvta;
    }

    public void setIvaDetvta(Integer ivaDetvta) {
        this.ivaDetvta = ivaDetvta;
    }

    @Basic
    @Column(name = "VALOR_DETVTA")
    public Integer getValorDetvta() {
        return valorDetvta;
    }

    public void setValorDetvta(Integer valorDetvta) {
        this.valorDetvta = valorDetvta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleVentaLibroEntity that = (DetalleVentaLibroEntity) o;
        return Objects.equals(idDetalle, that.idDetalle) &&
                Objects.equals(idVentaFk, that.idVentaFk) &&
                Objects.equals(idCodBarraLib, that.idCodBarraLib) &&
                Objects.equals(idTipoLib, that.idTipoLib) &&
                Objects.equals(idUsadovta, that.idUsadovta) &&
                Objects.equals(cantidad, that.cantidad) &&
                Objects.equals(netoDetvta, that.netoDetvta) &&
                Objects.equals(ivaDetvta, that.ivaDetvta) &&
                Objects.equals(valorDetvta, that.valorDetvta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetalle, idVentaFk, idCodBarraLib, idTipoLib, idUsadovta, cantidad, netoDetvta, ivaDetvta, valorDetvta);
    }
}
