package com.kaua.pokemon.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioDTO {
    private Integer idUsuario;
    private String nome;
    private String email;
    private LocalDateTime dthrCadastro;
    private LocalDateTime dthrAtualizacao;
    private Integer idImagem;
}
