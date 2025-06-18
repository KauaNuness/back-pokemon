package com.kaua.pokemon.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @Column(name = "NOME_USUARIO")
    private String nome;

    @Column(name = "EMAIL_USUARIO", unique = true)
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
