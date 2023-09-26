package com.cursocrud.ejercicio2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cursocrud.ejercicio2.model.Curso;

@Service
public class CursoServiceImpl implements CursoService{
    private List<Curso> cursos;

    public CursoServiceImpl(){
        this.cursos = new ArrayList<>();
        cursos.add(new Curso(1, "Java", 120, 200));
        cursos.add(new Curso(2, "Python", 240, 250));
        cursos.add(new Curso(3, "JavaScript", 120, 200));
        cursos.add(new Curso(4, "Angular", 240, 275));
    }
    public List<Curso> cursos(){
        return cursos;
    }

    public void altaCurso(Curso curso){
        cursos.add(curso);
    }

    public void actualizarCurso(Curso curso){
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodCurso() == curso.getCodCurso()) {
                cursos.set(i, curso);
                break;
            }
        }
    }

    public List<Curso> eliminarCurso(int codCurso){
       cursos.removeIf(curso -> curso.getCodCurso() == codCurso);
       return this.cursos;
    }

    public Curso buscarCurso(int codCurso){
        return cursos.stream().filter(curso -> curso.getCodCurso() == codCurso).findFirst().orElse(null);
    }
}
