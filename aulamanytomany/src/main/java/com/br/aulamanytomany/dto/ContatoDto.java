package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Contato;
import com.br.aulamanytomany.entities.Usuario;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

public class ContatoDto implements Serializable {

    private int id;
    private String nome;
    private String telefone;
    private int idUsuario;

    public ContatoDto(Contato contato) {
        this.id = contato.getId();
        this.nome = contato.getNome();
        this.telefone = contato.getTelefone();
        this.idUsuario = contato.getUsuario().getId();
    }

}
