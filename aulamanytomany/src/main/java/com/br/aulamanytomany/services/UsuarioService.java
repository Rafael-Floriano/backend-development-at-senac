package com.br.aulamanytomany.services;

import com.br.aulamanytomany.dto.UsuarioDto;
import com.br.aulamanytomany.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional(readOnly = true)
    public List<UsuarioDto> buscaUsuarios() {

    }

}
