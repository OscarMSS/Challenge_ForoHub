package com.Alura_Challenge.Foro_Hub.Domain.Respuesta.DTO;

public record Actualizar_Respuesta_DTO(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}