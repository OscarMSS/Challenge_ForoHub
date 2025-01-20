package com.Alura_Challenge.Foro_Hub.Domain.Curso.DTO;


import com.Alura_Challenge.Foro_Hub.Domain.Curso.Categoria;
import com.Alura_Challenge.Foro_Hub.Domain.Curso.Curso;

public record Detalles_Curso_DTO(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo) {

    public Detalles_Curso_DTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }

}
