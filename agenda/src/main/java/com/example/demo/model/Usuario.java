package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Agenda> agendaList;

}
