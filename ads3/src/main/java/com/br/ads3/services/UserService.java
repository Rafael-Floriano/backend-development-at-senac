package com.br.ads3.services;

import com.br.ads3.entities.Usuario;
import com.br.ads3.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional(rollbackOn = Exception.class)
    public void createUser(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

}
