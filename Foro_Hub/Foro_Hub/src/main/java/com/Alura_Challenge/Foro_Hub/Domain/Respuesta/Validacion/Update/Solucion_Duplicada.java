package com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Validacion.Update;

import com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Respuesta;
import com.Alura_Challenge.Foro_Hub.Domain.Respuesta.DTO.Actualizar_Respuesta_DTO;
import com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Repositorio.Respuesta_Repository;
import com.Alura_Challenge.Foro_Hub.Domain.Topico.Estado;
import com.Alura_Challenge.Foro_Hub.Domain.Topico.Repositorio.Topico_Repository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Solucion_Duplicada implements Validar_Respuesta_Actualizada {

    @Autowired
    private Respuesta_Repository respuestaRepository;

    @Autowired
    private Topico_Repository topicoRepository;

    @Override
    public void validate(Actualizar_Respuesta_DTO data, Long respuestaId) {
        if (data.solucion()){
            Respuesta respuesta = respuestaRepository.getReferenceById(respuestaId);
            var topicoResuelto = topicoRepository.getReferenceById(respuesta.getTopico().getId());
            if (topicoResuelto.getEstado() == Estado.CLOSED){
                throw new ValidationException("Este topico ya esta solucionado.");
            }
        }
    }
}