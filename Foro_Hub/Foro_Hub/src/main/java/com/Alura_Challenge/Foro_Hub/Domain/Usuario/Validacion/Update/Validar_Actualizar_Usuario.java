package com.Alura_Challenge.Foro_Hub.Domain.Usuario.Validacion.Update;

import com.Alura_Challenge.Foro_Hub.Domain.Usuario.DTO.Actualizar_Usuario_DTO;
import com.Alura_Challenge.Foro_Hub.Domain.Usuario.DTO.Autenticacion_Usuario_DTO;

public interface Validar_Actualizar_Usuario {
    void validate(Actualizar_Usuario_DTO data);
}