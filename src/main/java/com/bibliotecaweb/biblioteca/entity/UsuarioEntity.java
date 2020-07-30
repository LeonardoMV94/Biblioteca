package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "biblioteca", catalog = "")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;

    @Basic
    @Column(name = "rut_usuario")
    private String rutUsuario;

    @Basic
    @Column(name = "clave")
    private String clave;

    @OneToOne
    @JoinColumn(name = "rol")
    private RolesUsuarioEntity rol;



    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }


    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public RolesUsuarioEntity getRol() {
        return rol;
    }

    public void setRol(RolesUsuarioEntity rol) {
        this.rol = rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioEntity)) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return getIdUsuario() == that.getIdUsuario() &&
                Objects.equals(getRutUsuario(), that.getRutUsuario()) &&
                Objects.equals(getClave(), that.getClave()) &&
                Objects.equals(getRol(), that.getRol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUsuario(), getRutUsuario(), getClave(), getRol());
    }
}
