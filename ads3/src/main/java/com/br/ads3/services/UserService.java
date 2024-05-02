package com.br.ads3.services;

import com.br.ads3.entities.Usuario;
import com.br.ads3.repository.UsuarioRepository;
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
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional(rollbackOn = Exception.class)
    public void createUser(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<Usuario> showAllUsers() {
        return usuarioRepository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void deleteUseById(@NotNull Integer userId) {
        usuarioRepository.deleteById(userId);
    }

}
