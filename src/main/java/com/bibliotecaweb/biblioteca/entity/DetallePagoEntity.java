package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detalle_pago", schema = "biblioteca", catalog = "")
public class DetallePagoEntity {
    private Integer idDetpago;
    private Integer idFormaPago;
    private Integer monto;
    private Integer idVenta;

    @Id
    @Column(name = "ID_DETPAGO")
    public Integer getIdDetpago() {
        return idDetpago;
    }

    public void setIdDetpago(Integer idDetpago) {
        this.idDetpago = idDetpago;
    }

    @Basic
    @Column(name = "ID_FORMA_PAGO")
    public Integer getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(Integer idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    @Basic
    @Column(name = "MONTO")
    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "ID_VENTA")
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetallePagoEntity that = (DetallePagoEntity) o;
        return Objects.equals(idDetpago, that.idDetpago) &&
                Objects.equals(idFormaPago, that.idFormaPago) &&
                Objects.equals(monto, that.monto) &&
                Objects.equals(idVenta, that.idVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDetpago, idFormaPago, monto, idVenta);
    }
}
