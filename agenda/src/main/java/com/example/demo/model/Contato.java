package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contato implements Serializable {

    private Long id;
    private String nome;
    private String telefone;
    @OneToOne(fetch = FetchType.EAGER)
    private Agenda agenda;

}
