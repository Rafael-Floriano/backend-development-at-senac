package com.br.aulamanytomany.controllers;

import com.br.aulamanytomany.dto.UsuarioDto;
import com.br.aulamanytomany.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/todos")
    public List<UsuarioDto> listarUsuarios() {
        return usuarioService.buscaUsuarios();
    }

}
