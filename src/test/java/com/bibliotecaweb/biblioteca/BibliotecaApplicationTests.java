package com.bibliotecaweb.biblioteca;

import com.bibliotecaweb.biblioteca.entity.RegionEntity;
import com.bibliotecaweb.biblioteca.entity.UsuarioEntity;
import com.bibliotecaweb.biblioteca.repository.IRolesUsuarioRepository;
import com.bibliotecaweb.biblioteca.repository.IUsuarioRepository;
import com.bibliotecaweb.biblioteca.service.RegionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@SpringBootTest
class BibliotecaApplicationTests {

    @Autowired
    private IUsuarioRepository repo;

    @Autowired
    private BCryptPasswordEncoder encoder;
    @Autowired
    private IRolesUsuarioRepository rol;

    @Autowired
    private RegionService servicioRegion;

    @Test
    public void crearUsuarioTest(){
        UsuarioEntity us = new UsuarioEntity();
        us.setRutUsuario("3-3");
        us.setClave(encoder.encode("123"));
        us.setRol(rol.getOne(3));
        // TODO por verificar rol de usuario
        UsuarioEntity retorno =  repo.save(us);

        assert (retorno.getClave().equalsIgnoreCase(us.getClave()));
    }

    @Test
    public void editarRegion(){
       Optional<RegionEntity> regionOp = servicioRegion.obtenerRegion(5);

       if (regionOp.isPresent()){
           RegionEntity region = regionOp.get();
           region.setIdRegion(5);
           region.setNombreReg("valporro");
           region.setNumeroReg("VVVV");
           servicioRegion.editarRegion(region);
           assert (region.getNombreReg().equals("valporro"));
       }


    }

}
