package com.Alura_Challenge.Foro_Hub.Domain.Usuario.Validacion.Update;

import com.Alura_Challenge.Foro_Hub.Domain.Usuario.DTO.Actualizar_Usuario_DTO;
import com.Alura_Challenge.Foro_Hub.Domain.Usuario.Repositorio.Usuario_Repository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Valida_Actualizacion_Usuario implements Validar_Actualizar_Usuario {

    @Autowired
    private Usuario_Repository repository;

    @Override
    public void validate(Actualizar_Usuario_DTO data) {
        if(data.email() != null){
            var emailDuplicado = repository.findByEmail(data.email());
            if(emailDuplicado != null){
                throw new ValidationException("Este email ya esta en uso");
            }
        }
    }
}