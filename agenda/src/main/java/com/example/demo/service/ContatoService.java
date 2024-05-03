package com.example.demo.service;

import com.example.demo.model.Agenda;
import com.example.demo.model.Contato;
import com.example.demo.repository.AgendaRepository;
import com.example.demo.repository.ContatoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Slf4j
@Service
@Validated
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    @Transactional(rollbackOn = Exception.class)
    public void createNewUser(@NotNull Contato contato) {
        contatoRepository.save(contato);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<Contato> listAllUsers() {
        return contatoRepository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void deleteUserById(@NotNull Long idContato) {
        contatoRepository.deleteById(idContato);
    }

}
