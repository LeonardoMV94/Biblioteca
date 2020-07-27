package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "estado_lib_usado", schema = "biblioteca", catalog = "")
public class EstadoLibUsadoEntity {
    private Integer idEstadolibusd;
    private String descripEstlibus;
    private Boolean desctoEstlibus;

    @Id
    @Column(name = "ID_ESTADOLIBUSD")
    public Integer getIdEstadolibusd() {
        return idEstadolibusd;
    }

    public void setIdEstadolibusd(Integer idEstadolibusd) {
        this.idEstadolibusd = idEstadolibusd;
    }

    @Basic
    @Column(name = "DESCRIP_ESTLIBUS")
    public String getDescripEstlibus() {
        return descripEstlibus;
    }

    public void setDescripEstlibus(String descripEstlibus) {
        this.descripEstlibus = descripEstlibus;
    }

    @Basic
    @Column(name = "DESCTO_ESTLIBUS")
    public Boolean getDesctoEstlibus() {
        return desctoEstlibus;
    }

    public void setDesctoEstlibus(Boolean desctoEstlibus) {
        this.desctoEstlibus = desctoEstlibus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadoLibUsadoEntity that = (EstadoLibUsadoEntity) o;
        return Objects.equals(idEstadolibusd, that.idEstadolibusd) &&
                Objects.equals(descripEstlibus, that.descripEstlibus) &&
                Objects.equals(desctoEstlibus, that.desctoEstlibus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstadolibusd, descripEstlibus, desctoEstlibus);
    }
}
