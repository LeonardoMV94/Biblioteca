package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "cargo_trabajador", schema = "biblioteca", catalog = "")
public class CargoTrabajadorEntity {
    private Integer idTrabcarg;
    private Integer idRuttra;
    private Integer idCargo;
    private Date fechaInic;
    private Date fechaFin;
    private String motivoFinContrato;
    private Byte estado;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRABCARG")
    public Integer getIdTrabcarg() {
        return idTrabcarg;
    }

    public void setIdTrabcarg(Integer idTrabcarg) {
        this.idTrabcarg = idTrabcarg;
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
    @Column(name = "ID_CARGO")
    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "FECHA_INIC")
    public Date getFechaInic() {
        return fechaInic;
    }

    public void setFechaInic(Date fechaInic) {
        this.fechaInic = fechaInic;
    }

    @Basic
    @Column(name = "FECHA_FIN")
    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Basic
    @Column(name = "MOTIVO_FIN_CONTRATO")
    public String getMotivoFinContrato() {
        return motivoFinContrato;
    }

    public void setMotivoFinContrato(String motivoFinContrato) {
        this.motivoFinContrato = motivoFinContrato;
    }

    @Basic
    @Column(name = "ESTADO")
    public Byte getEstado() {
        return estado;
    }

    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoTrabajadorEntity that = (CargoTrabajadorEntity) o;
        return Objects.equals(idTrabcarg, that.idTrabcarg) &&
                Objects.equals(idRuttra, that.idRuttra) &&
                Objects.equals(idCargo, that.idCargo) &&
                Objects.equals(fechaInic, that.fechaInic) &&
                Objects.equals(fechaFin, that.fechaFin) &&
                Objects.equals(motivoFinContrato, that.motivoFinContrato) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTrabcarg, idRuttra, idCargo, fechaInic, fechaFin, motivoFinContrato, estado);
    }
}
