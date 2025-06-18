package com.kaua.pokemon.controller;

import com.kaua.pokemon.dto.UsuarioDTO;
import com.kaua.pokemon.security.JwtService;
import com.kaua.pokemon.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UsuarioService usuarioService;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/register")
    public ResponseEntity<UsuarioDTO> register(@RequestBody UsuarioDTO dto) {
        System.out.println("DTO recebido no controller: " + dto);
        UsuarioDTO criado = usuarioService.criarUsuario(dto);
        return ResponseEntity.ok(criado);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UsuarioDTO dto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getSenha())
        );
        return ResponseEntity.ok(jwtService.generateToken(dto.getEmail()));
    }
}
