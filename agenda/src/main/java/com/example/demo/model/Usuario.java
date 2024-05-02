package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    private Long id;
    private String nome;
    private String cpf;
    private String email;

}