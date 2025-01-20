package com.Alura_Challenge.Foro_Hub.Domain.Topico.Validacion.Create;


import com.desafio.forohub.domain.topico.dto.CrearTopicoDTO;

public interface Validar_Topico_Creado {

    void validate(CrearTopicoDTO data);
}