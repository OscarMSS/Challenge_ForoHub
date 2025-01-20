package com.Alura_Challenge.Foro_Hub.Domain.Topico.Validacion.Update;

import com.desafio.forohub.domain.topico.dto.ActualizarTopicoDTO;

public interface Validar_Topico_Actualizado {
    void validate(ActualizarTopicoDTO data);
}