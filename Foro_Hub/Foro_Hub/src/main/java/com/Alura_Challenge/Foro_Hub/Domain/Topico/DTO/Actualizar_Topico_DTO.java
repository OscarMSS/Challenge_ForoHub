package com.Alura_Challenge.Foro_Hub.Domain.Topico.DTO;


import com.Alura_Challenge.Foro_Hub.Domain.Topico.Estado;
public record Actualizar_Topico_DTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
