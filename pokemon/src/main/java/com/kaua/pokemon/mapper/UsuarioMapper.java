package com.kaua.pokemon.mapper;

import com.kaua.pokemon.dto.UsuarioDTO;
import com.kaua.pokemon.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(source = "idUsuario", target = "idUsuario")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "senha", target = "senha")
    @Mapping(source = "dthrCadastro", target = "dthrCadastro")
    @Mapping(source = "dthrAtualizacao", target = "dthrAtualizacao")
    @Mapping(source = "idImagem", target = "idImagem")
    UsuarioDTO toDTO(Usuario usuario);

    @Mapping(source = "idUsuario", target = "idUsuario")
    @Mapping(source = "nome", target = "nome")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "senha", target = "senha")
    @Mapping(source = "dthrCadastro", target = "dthrCadastro")
    @Mapping(source = "dthrAtualizacao", target = "dthrAtualizacao")
    @Mapping(source = "idImagem", target = "idImagem")
    Usuario toEntity(UsuarioDTO usuarioDTO);
}

