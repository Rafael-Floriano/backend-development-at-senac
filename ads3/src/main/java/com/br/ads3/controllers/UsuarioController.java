package com.br.ads3.controllers;

import com.br.ads3.entities.Usuario;
import com.br.ads3.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UserService userService;

    @PostMapping("/cadastro")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "User has been created!")
    public void createUser(Usuario usuario) {
        userService.createUser(usuario);
    }

    @GetMapping("/listar")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public List<Usuario> showAllUsers() {
        return userService.showAllUsers();
    }

}
