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
    @ResponseStatus(value = HttpStatus.CREATED, reason = "Usuário foi criado com sucesso!")
    public void createNewUser(@RequestBody @NotNull Usuario usuario) {
        usuarioService.createNewUser(usuario);
    }

    @GetMapping("/listar/todos")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Usuario> listAllUsers() {
        return usuarioService.listAllUsers();
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Usuário excluído com sucesso!")
    public void deleteUserById(@PathVariable("id") @NotNull Long userId) {
        usuarioService.deleteUserById(userId);
    }

}
