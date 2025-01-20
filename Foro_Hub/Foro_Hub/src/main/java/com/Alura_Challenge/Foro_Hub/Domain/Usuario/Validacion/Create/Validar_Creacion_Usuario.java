package com.Alura_Challenge.Foro_Hub.Domain.Usuario.Validacion.Create;

import com.desafio.forohub.domain.usuario.dto.CrearUsuarioDTO;

public interface Validar_Creacion_Usuario {
    void validate(CrearUsuarioDTO data);
}