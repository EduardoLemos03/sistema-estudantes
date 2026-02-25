package com.eduardo.sistema_estudantes.service;

import com.eduardo.sistema_estudantes.model.Estudante;
import com.eduardo.sistema_estudantes.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SistemaService {

    private List<Estudante> listaEstudantes = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();


    public List<Estudante> listarEstudantes() {
        return listaEstudantes;
    }

    public Estudante adicionarEstudante(Estudante estudante) {
        listaEstudantes.add(estudante);
        return estudante;
    }

    public Estudante buscarEstudantePorMatricula(String matricula) {
        for (Estudante e : listaEstudantes) {
            if (e.getMatricula().equals(matricula)) {
                return e;
            }
        }
        return null;
    }


    public List<Curso> listarCursos() {
        return listaCursos;
    }

    public Curso adicionarCurso(Curso curso) {
        listaCursos.add(curso);
        return curso;
    }

    public Curso buscarCursoPorId(Long id) {
        for (Curso c : listaCursos) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public List<Estudante> buscarEstudantesPorCurso(String curso) {
        List<Estudante> resultado = new ArrayList<>();
        for (Estudante e : listaEstudantes) {
            if (e.getCurso().equalsIgnoreCase(curso)) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    public SistemaService() {
        listaEstudantes.add(new Estudante("123", "Eduardo", "ADS", 3));
        listaEstudantes.add(new Estudante("456", "Maria", "ES", 2));
        listaEstudantes.add(new Estudante("321", "José", "CC", 7));
    }

}