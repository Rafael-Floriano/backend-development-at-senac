package com.example.demo.controller;

import com.example.demo.model.Agenda;
import com.example.demo.model.Contato;
import com.example.demo.service.AgendaService;
import com.example.demo.service.ContatoService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @PostMapping("/criar")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "Contato foi criado com sucesso!")
    public void createNewUser(@RequestBody @NotNull Contato contato) {
        contatoService.createNewUser(contato);
    }

    @GetMapping("/listar/todos")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Contato> listAllUsers() {
        return contatoService.listAllUsers();
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Contato excluído com sucesso!")
    public void deleteUserById(@PathVariable("id") @NotNull Long userId) {
        contatoService.deleteUserById(userId);
    }

}
