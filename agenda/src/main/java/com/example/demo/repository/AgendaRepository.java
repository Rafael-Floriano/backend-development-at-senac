package com.example.demo.repository;

import com.example.demo.model.Agenda;
import com.example.demo.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    List<Contato> findContatosById(Long id);

}
