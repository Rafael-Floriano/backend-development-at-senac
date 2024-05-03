package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/criar")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "Usuario foi criado com sucesso!")
    public void createNewUser(@RequestBody @NotNull Usuario usuario) {
        usuarioService.createNewUser(usuario);
    }

    @GetMapping("/listar/todos")
    public List<Usuario> listAllUsers() {
        usuarioService.listAllUsers();
    }

}
