package com.Alura_Challenge.Foro_Hub.Domain.Curso.Repositorio;


import com.Alura_Challenge.Foro_Hub.Domain.Curso.Curso;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Curso_Repository extends JpaRepository<Curso, Long> {

    Page<Curso> findAllByActivoTrue(Pageable pageable);
}