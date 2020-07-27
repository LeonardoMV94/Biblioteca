package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "libro", schema = "biblioteca", catalog = "")
public class LibroEntity {
    private Integer idCodBarra;
    private Integer isbnactLib;
    private Integer isbnorigLib;
    private String tituloLib;
    private Integer numpagLib;
    private Date añopubliLib;
    private String edicionLib;
    private Integer idEditorial;

    @Id
    @Column(name = "ID_COD_BARRA")
    public Integer getIdCodBarra() {
        return idCodBarra;
    }

    public void setIdCodBarra(Integer idCodBarra) {
        this.idCodBarra = idCodBarra;
    }

    @Basic
    @Column(name = "ISBNACT_LIB")
    public Integer getIsbnactLib() {
        return isbnactLib;
    }

    public void setIsbnactLib(Integer isbnactLib) {
        this.isbnactLib = isbnactLib;
    }

    @Basic
    @Column(name = "ISBNORIG_LIB")
    public Integer getIsbnorigLib() {
        return isbnorigLib;
    }

    public void setIsbnorigLib(Integer isbnorigLib) {
        this.isbnorigLib = isbnorigLib;
    }

    @Basic
    @Column(name = "TITULO_LIB")
    public String getTituloLib() {
        return tituloLib;
    }

    public void setTituloLib(String tituloLib) {
        this.tituloLib = tituloLib;
    }

    @Basic
    @Column(name = "NUMPAG_LIB")
    public Integer getNumpagLib() {
        return numpagLib;
    }

    public void setNumpagLib(Integer numpagLib) {
        this.numpagLib = numpagLib;
    }

    @Basic
    @Column(name = "AÑOPUBLI_LIB")
    public Date getAñopubliLib() {
        return añopubliLib;
    }

    public void setAñopubliLib(Date añopubliLib) {
        this.añopubliLib = añopubliLib;
    }

    @Basic
    @Column(name = "EDICION_LIB")
    public String getEdicionLib() {
        return edicionLib;
    }

    public void setEdicionLib(String edicionLib) {
        this.edicionLib = edicionLib;
    }

    @Basic
    @Column(name = "ID_EDITORIAL")
    public Integer getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Integer idEditorial) {
        this.idEditorial = idEditorial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibroEntity that = (LibroEntity) o;
        return Objects.equals(idCodBarra, that.idCodBarra) &&
                Objects.equals(isbnactLib, that.isbnactLib) &&
                Objects.equals(isbnorigLib, that.isbnorigLib) &&
                Objects.equals(tituloLib, that.tituloLib) &&
                Objects.equals(numpagLib, that.numpagLib) &&
                Objects.equals(añopubliLib, that.añopubliLib) &&
                Objects.equals(edicionLib, that.edicionLib) &&
                Objects.equals(idEditorial, that.idEditorial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCodBarra, isbnactLib, isbnorigLib, tituloLib, numpagLib, añopubliLib, edicionLib, idEditorial);
    }
}
