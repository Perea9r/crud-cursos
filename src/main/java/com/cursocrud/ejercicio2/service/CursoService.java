package com.cursocrud.ejercicio2.service;

import java.util.List;

import com.cursocrud.ejercicio2.model.Curso;

public interface CursoService {
    List<Curso> cursos();

    void altaCurso(Curso curso);
    void actualizarCurso(Curso curso);
    List<Curso> eliminarCurso(int codCurso);
    Curso buscarCurso(int codCurso);
}
