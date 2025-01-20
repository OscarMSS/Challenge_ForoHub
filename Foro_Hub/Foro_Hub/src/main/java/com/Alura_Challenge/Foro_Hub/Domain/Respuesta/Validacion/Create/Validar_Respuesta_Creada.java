package com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Validacion.Create;

import com.Alura_Challenge.Foro_Hub.Domain.Respuesta.DTO.Crear_Respuesta_DTO;

public interface Validar_Respuesta_Creada {
    void validate(Crear_Respuesta_DTO data);
}
