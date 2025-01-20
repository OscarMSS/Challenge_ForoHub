package com.Alura_Challenge.Foro_Hub.Domain.Topico.DTO;

import com.Alura_Challenge.Foro_Hub.Domain.Curso.Categoria;
import com.Alura_Challenge.Foro_Hub.Domain.Topico.Estado;
import com.Alura_Challenge.Foro_Hub.Domain.Topico.Topico;

import java.time.LocalDateTime;

public record Detalles_Topico_DTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        LocalDateTime ultimaActualizacion,
        Estado estado,
        String usuario,
        String curso,
        Categoria categoriaCurso

) {

    public Detalles_Topico_DTO(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getUltimaActualizacion(),
                topico.getEstado(),
                topico.getUsuario().getUsername(),
                topico.getCurso().getName(),
                topico.getCurso().getCategoria()
        );
    }

}
