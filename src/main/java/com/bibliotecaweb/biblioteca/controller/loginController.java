package com.bibliotecaweb.biblioteca.controller;

import com.bibliotecaweb.biblioteca.entity.LoginForm;
import com.bibliotecaweb.biblioteca.entity.UsuarioEntity;
import com.bibliotecaweb.biblioteca.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class loginController {

    @Autowired
    private UserService userDB;

   /* @Autowired
    private BCryptPasswordEncoder encoder;*/

    @RequestMapping("/login")
    public String getLoginForm(Model model){
        model.addAttribute("titulo","Login");
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model){
        String username= loginForm.getUsername();
        String pass= loginForm.getPass();

        UsuarioEntity usr = userDB.findUsuario(username);

        if (usr != null ) {

            if (usr.getRutUsuario().equals(username) ){
                return "index";
            } else{
                model.addAttribute("errorpass", "contraseña incorrectos");
                return "login";
            }

        }else{
            model.addAttribute("error","no existe el usuario " + username);
            return "login";
        }
    }

}


























