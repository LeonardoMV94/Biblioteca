package com.bibliotecaweb.biblioteca.service;

import com.bibliotecaweb.biblioteca.entity.RolesUsuarioEntity;
import com.bibliotecaweb.biblioteca.entity.UsuarioEntity;
import com.bibliotecaweb.biblioteca.repository.IRolesUsuarioRepository;
import com.bibliotecaweb.biblioteca.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

     @Autowired
     private IUsuarioRepository repo;
     @Autowired
     private IRolesUsuarioRepository roles;

    @Override
    public UserDetails loadUserByUsername(String rutUsuario) throws UsernameNotFoundException {
        UsuarioEntity us = repo.findByRutUsuario(rutUsuario);

        List<RolesUsuarioEntity> listRol = roles.findAll();
        List<GrantedAuthority> listRolAuth = new ArrayList<>();

        /* añadiendo roles desde la base de datos*/
        for (RolesUsuarioEntity r : listRol) {
            listRolAuth.add(new SimpleGrantedAuthority(r.getRolUsuario()));
        }


        UserDetails userDetails = new User(us.getRutUsuario(),us.getClave(),listRolAuth);
        return  userDetails;

    }

    public UsuarioEntity findUsuario(String rutUsuario){
        return repo.findByRutUsuario(rutUsuario);
    }


}
