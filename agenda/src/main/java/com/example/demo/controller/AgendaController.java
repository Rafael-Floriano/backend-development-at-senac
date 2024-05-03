package com.example.demo.controller;

import com.example.demo.model.Agenda;
import com.example.demo.model.Usuario;
import com.example.demo.service.AgendaService;
import com.example.demo.service.UsuarioService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @PostMapping("/criar")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "Agenda foi criada com sucesso!")
    public void createNewUser(@RequestBody @NotNull Agenda agenda) {
        agendaService.createNewUser(agenda);
    }

    @GetMapping("/listar/todos")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Agenda> listAllUsers() {
        return agendaService.listAllUsers();
    }

    @DeleteMapping("/deletar/{id}")
    @ResponseStatus(value = HttpStatus.OK, reason = "Agenda excluída com sucesso!")
    public void deleteUserById(@PathVariable("id") @NotNull Long userId) {
        agendaService.deleteUserById(userId);
    }

}
