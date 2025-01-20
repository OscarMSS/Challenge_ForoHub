package com.Alura_Challenge.Foro_Hub.Domain.Usuario.DTO;

import com.Alura_Challenge.Foro_Hub.Domain.Usuario.Role;

public record Actualizar_Usuario_DTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}