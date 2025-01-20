package com.Alura_Challenge.Foro_Hub.Domain.Usuario.DTO;

import com.desafio.forohub.domain.usuario.Usuario;
import com.desafio.forohub.domain.usuario.Role;

public record Detalles_Usuario_DTO(
        Long id,
        String username,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {

    public Detalles_Usuario_DTO(Usuario usuario){
        this(usuario.getId(),
                usuario.getUsername(),
                usuario.getRole(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getEmail(),
                usuario.getEnabled()
        );
    }
}