package com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Validacion.Create;

import com.Alura_Challenge.Foro_Hub.Domain.Topico.Repositorio.Topico_Repository;
import com.desafio.forohub.domain.respuesta.dto.CrearRespuestaDTO;
import com.desafio.forohub.domain.topico.Estado;
import com.desafio.forohub.domain.topico.repository.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Respuesta_Topico_Valida implements Validar_Respuesta_Creada{

    @Autowired
    private Topico_Repository repository;

    @Override
    public void validate(Crear_Respuesta_DTO data) {
        var topicoExiste = repository.existsById(data.topicoId());

        if (!topicoExiste){
            throw new ValidationException("Este topico no existe.");
        }

        var topicoAbierto = repository.findById(data.topicoId()).get().getEstado();

        if(topicoAbierto != Estado.OPEN){
            throw new ValidationException("Este topico no esta abierto.");
        }

    }
}