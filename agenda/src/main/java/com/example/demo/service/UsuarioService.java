package com.example.demo.service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Slf4j
@Service
@Validated
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional(rollbackOn = Exception.class)
    public void createNewUser(@NotNull Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<Usuario> listAllUsers() {
        return usuarioRepository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void deleteUserById(@NotNull Long idUser) {
        usuarioRepository.deleteById(idUser);
    }

}
