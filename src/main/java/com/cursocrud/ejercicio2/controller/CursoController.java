package com.cursocrud.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cursocrud.ejercicio2.model.Curso;
import com.cursocrud.ejercicio2.service.CursoService;

@RestController
public class CursoController {
    
    @Autowired
    CursoService service;
    @GetMapping(value="/curso/{codCurso})" , produces=MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable("codCurso") int codCurso){
        return service.buscarCurso(codCurso);
    }

    @GetMapping(value="/cursos", produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> cursos(){
        return service.cursos();
        
    }

    @PostMapping(value="/curso" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregar(@RequestBody Curso libro){
        service.altaCurso(libro);
    }

    @PutMapping(value="/curso" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actualizar(@RequestBody Curso curso){
        service.actualizarCurso(curso);
    }

    @DeleteMapping(value="/curso/{codCurso}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso(@PathVariable("codCurso") int codCurso){
        return service.eliminarCurso(codCurso);
    }
}
