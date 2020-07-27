package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "compralibros", schema = "biblioteca", catalog = "")
public class CompralibrosEntity {
    private Integer idCompra;
    private Integer numfactComp;
    private Integer idTipodoc;
    private Date fechafacComp;
    private Integer valorSubtotalComp;
    private Integer ivaTotal;
    private Integer valortotCompTotal;
    private Integer idRutDistribuidor;
    private Integer idRutTrab;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPRA")
    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    @Basic
    @Column(name = "NUMFACT_COMP")
    public Integer getNumfactComp() {
        return numfactComp;
    }

    public void setNumfactComp(Integer numfactComp) {
        this.numfactComp = numfactComp;
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
    @Column(name = "FECHAFAC_COMP")
    public Date getFechafacComp() {
        return fechafacComp;
    }

    public void setFechafacComp(Date fechafacComp) {
        this.fechafacComp = fechafacComp;
    }

    @Basic
    @Column(name = "VALOR_SUBTOTAL_COMP")
    public Integer getValorSubtotalComp() {
        return valorSubtotalComp;
    }

    public void setValorSubtotalComp(Integer valorSubtotalComp) {
        this.valorSubtotalComp = valorSubtotalComp;
    }

    @Basic
    @Column(name = "IVA_total")
    public Integer getIvaTotal() {
        return ivaTotal;
    }

    public void setIvaTotal(Integer ivaTotal) {
        this.ivaTotal = ivaTotal;
    }

    @Basic
    @Column(name = "VALORTOT_COMP_total")
    public Integer getValortotCompTotal() {
        return valortotCompTotal;
    }

    public void setValortotCompTotal(Integer valortotCompTotal) {
        this.valortotCompTotal = valortotCompTotal;
    }

    @Basic
    @Column(name = "ID_RUT_DISTRIBUIDOR")
    public Integer getIdRutDistribuidor() {
        return idRutDistribuidor;
    }

    public void setIdRutDistribuidor(Integer idRutDistribuidor) {
        this.idRutDistribuidor = idRutDistribuidor;
    }

    @Basic
    @Column(name = "ID_RUT_TRAB")
    public Integer getIdRutTrab() {
        return idRutTrab;
    }

    public void setIdRutTrab(Integer idRutTrab) {
        this.idRutTrab = idRutTrab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompralibrosEntity that = (CompralibrosEntity) o;
        return Objects.equals(idCompra, that.idCompra) &&
                Objects.equals(numfactComp, that.numfactComp) &&
                Objects.equals(idTipodoc, that.idTipodoc) &&
                Objects.equals(fechafacComp, that.fechafacComp) &&
                Objects.equals(valorSubtotalComp, that.valorSubtotalComp) &&
                Objects.equals(ivaTotal, that.ivaTotal) &&
                Objects.equals(valortotCompTotal, that.valortotCompTotal) &&
                Objects.equals(idRutDistribuidor, that.idRutDistribuidor) &&
                Objects.equals(idRutTrab, that.idRutTrab);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompra, numfactComp, idTipodoc, fechafacComp, valorSubtotalComp, ivaTotal, valortotCompTotal, idRutDistribuidor, idRutTrab);
    }
}
