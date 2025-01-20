package com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Validacion.Update;

import com.Alura_Challenge.Foro_Hub.Domain.Respuesta.DTO.Actualizar_Respuesta_DTO;

public interface Validar_Respuesta_Actualizada {

    void validate(Actualizar_Respuesta_DTO data, Long respuestaId);
}