package com.kaua.pokemon.service.impl;

import com.kaua.pokemon.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioDTO criarUsuario(UsuarioDTO dto);
    List<UsuarioDTO> listarUsuarios();
    UsuarioDTO buscarPorId(Integer id);
    void deletarUsuario(Integer id);
}
