package com.bibliotecaweb.biblioteca.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "roles_usuario", schema = "biblioteca", catalog = "")
public class RolesUsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private int idRol;


    @Basic
    @Column(name = "rol_usuario")
    private String rolUsuario;


    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RolesUsuarioEntity)) return false;
        RolesUsuarioEntity that = (RolesUsuarioEntity) o;
        return getIdRol() == that.getIdRol() &&
                Objects.equals(getRolUsuario(), that.getRolUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdRol(), getRolUsuario());
    }
}
