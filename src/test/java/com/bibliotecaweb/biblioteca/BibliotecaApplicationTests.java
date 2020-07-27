package com.bibliotecaweb.biblioteca;

import com.bibliotecaweb.biblioteca.entity.UsuarioEntity;
import com.bibliotecaweb.biblioteca.repository.IRolesUsuarioRepository;
import com.bibliotecaweb.biblioteca.repository.IUsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class BibliotecaApplicationTests {

    @Autowired
    private IUsuarioRepository repo;

    @Autowired
    private BCryptPasswordEncoder encoder;
    @Autowired
    private IRolesUsuarioRepository rol;

    @Test
    public void crearUsuarioTest(){
        UsuarioEntity us = new UsuarioEntity();
        us.setRutUsuario("2-2");
        us.setClave(encoder.encode("123"));
        us.setRol(rol.getOne(2));

        UsuarioEntity retorno =  repo.save(us);

        assert (retorno.getClave().equalsIgnoreCase(us.getClave()));
    }

}
