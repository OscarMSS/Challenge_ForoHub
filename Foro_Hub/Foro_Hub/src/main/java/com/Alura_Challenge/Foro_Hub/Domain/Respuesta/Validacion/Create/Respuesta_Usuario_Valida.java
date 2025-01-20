package com.Alura_Challenge.Foro_Hub.Domain.Respuesta.Validacion.Create;

import com.desafio.forohub.domain.respuesta.dto.CrearRespuestaDTO;
import com.desafio.forohub.domain.usuario.repository.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Respuesta_Usuario_Valida implements Validar_Respuesta_Creada{

    @Autowired
    private Usuario_Repository repository;

    @Override
    public void validate(Crear_Respuesta_DTO data) {
        var usuarioExiste = repository.existsById(data.usuarioId());

        if(!usuarioExiste){
            throw new ValidationException("Este usuario no existe");
        }

        var usuarioHabilitado = repository.findById(data.usuarioId()).get().isEnabled();

        if(!usuarioHabilitado){
            throw new ValidationException("Este usuario no esta habilitado");
        }
    }
}