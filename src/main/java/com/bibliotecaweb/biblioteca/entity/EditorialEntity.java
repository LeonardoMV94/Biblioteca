package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "editorial", schema = "biblioteca", catalog = "")
public class EditorialEntity {
    private Integer idEditorial;
    private String nombreEdit;
    private String direccionEdit;
    private Integer idPais;
    private String fonoEdit;
    private String urlEdit;
    private String emailEdit;

    @Id
    @Column(name = "ID_EDITORIAL")
    public Integer getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Integer idEditorial) {
        this.idEditorial = idEditorial;
    }

    @Basic
    @Column(name = "NOMBRE_EDIT")
    public String getNombreEdit() {
        return nombreEdit;
    }

    public void setNombreEdit(String nombreEdit) {
        this.nombreEdit = nombreEdit;
    }

    @Basic
    @Column(name = "DIRECCION_EDIT")
    public String getDireccionEdit() {
        return direccionEdit;
    }

    public void setDireccionEdit(String direccionEdit) {
        this.direccionEdit = direccionEdit;
    }

    @Basic
    @Column(name = "ID_PAIS")
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    @Basic
    @Column(name = "FONO_EDIT")
    public String getFonoEdit() {
        return fonoEdit;
    }

    public void setFonoEdit(String fonoEdit) {
        this.fonoEdit = fonoEdit;
    }

    @Basic
    @Column(name = "URL_EDIT")
    public String getUrlEdit() {
        return urlEdit;
    }

    public void setUrlEdit(String urlEdit) {
        this.urlEdit = urlEdit;
    }

    @Basic
    @Column(name = "EMAIL_EDIT")
    public String getEmailEdit() {
        return emailEdit;
    }

    public void setEmailEdit(String emailEdit) {
        this.emailEdit = emailEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditorialEntity that = (EditorialEntity) o;
        return Objects.equals(idEditorial, that.idEditorial) &&
                Objects.equals(nombreEdit, that.nombreEdit) &&
                Objects.equals(direccionEdit, that.direccionEdit) &&
                Objects.equals(idPais, that.idPais) &&
                Objects.equals(fonoEdit, that.fonoEdit) &&
                Objects.equals(urlEdit, that.urlEdit) &&
                Objects.equals(emailEdit, that.emailEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEditorial, nombreEdit, direccionEdit, idPais, fonoEdit, urlEdit, emailEdit);
    }
}
