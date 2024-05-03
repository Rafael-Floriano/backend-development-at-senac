package com.example.demo.service;

import com.example.demo.model.Agenda;
import com.example.demo.model.Contato;
import com.example.demo.model.Usuario;
import com.example.demo.repository.AgendaRepository;
import com.example.demo.repository.UsuarioRepository;
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
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    @Transactional(rollbackOn = Exception.class)
    public void createNewUser(@NotNull Agenda agenda) {
        agendaRepository.save(agenda);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<Agenda> listAllUsers() {
        return agendaRepository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public void deleteUserById(@NotNull Long idAgenda) {
        agendaRepository.deleteById(idAgenda);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<Contato> showAllContactsByIdAgenda(@NotNull Long agendaId) {
        return agendaRepository.findContatosById(agendaId);
    }

}
