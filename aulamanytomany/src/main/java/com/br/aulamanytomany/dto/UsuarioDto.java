package com.br.aulamanytomany.dto;

import com.br.aulamanytomany.entities.Usuario;

import java.io.Serializable;
import java.util.List;

public class UsuarioDto implements Serializable {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    List<ContatoDto> contatoList;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.cpf = usuario.getCpf();
        this.email = usuario.getEmail();
        this.contatoList = usuario.getContatoList().stream().map(ContatoDto::new).toList();
    }

}
