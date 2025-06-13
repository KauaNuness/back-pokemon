package com.kaua.pokemon.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "EMAIL_USUARIO")
    private String email;

    @Column(name = "SENHA_USUARIO")
    private String senha;

    @Column(name = "DATA_CADASTRO_USUARIO")
    private LocalDateTime dthrCadastro;

    @Column(name = "DATA_ATUALIZACAO_USUARIO")
    private LocalDateTime dthrAtualizacao;

    @Column(name = "ID_IMAGEM")
    private Integer idImagem;

}
