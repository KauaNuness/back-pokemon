package com.kaua.pokemon.service;

import com.kaua.pokemon.dto.UsuarioDTO;
import com.kaua.pokemon.mapper.UsuarioMapper;
import com.kaua.pokemon.model.Usuario;
import com.kaua.pokemon.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final UsuarioMapper mapper;

    public UsuarioDTO criarUsuario(UsuarioDTO dto){
        Usuario usuario = mapper.toEntity(dto);
        System.out.println("Usuario convertido do DTO: " + usuario);
        usuario.setDthrCadastro(LocalDateTime.now());
        usuario.setDthrAtualizacao(LocalDateTime.now());
        Usuario salvo = repository.save(usuario);
        System.out.println("Usuario salvo: " + salvo);
        return mapper.toDTO(salvo);
    }

    public List<UsuarioDTO> listarUsuarios(){
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO buscarPorId(Integer id){
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        return mapper.toDTO(usuario);
    }

    public void deletarUsuario(Integer id) {
        if (!repository.existsById(id)) {
            throw new EntityNotFoundException("Usuário não encontrado");
        }
        repository.deleteById(id);
    }

}
