package com.Alura_Challenge.Foro_Hub.Domain.Curso.DTO;

import com.Alura_Challenge.Foro_Hub.Domain.Curso.Categoria;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record Crear_Curso_DTO(
        @NotBlank String name,
        @NotNull Categoria categoria) {
}