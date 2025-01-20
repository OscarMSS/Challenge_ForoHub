package com.Alura_Challenge.Foro_Hub.Domain.Curso.DTO;


import com.Alura_Challenge.Foro_Hub.Domain.Curso.Categoria;
public record Actualizar_Curso_DTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}