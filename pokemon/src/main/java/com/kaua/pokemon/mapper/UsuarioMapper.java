package com.kaua.pokemon.mapper;

import com.kaua.pokemon.dto.UsuarioDTO;
import com.kaua.pokemon.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioDTO toDTO(Usuario usuario);
    Usuario toEntity(UsuarioDTO usuarioDTO);
}
