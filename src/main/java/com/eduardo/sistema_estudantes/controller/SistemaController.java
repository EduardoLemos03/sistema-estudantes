package com.eduardo.sistema_estudantes.controller;

import com.eduardo.sistema_estudantes.model.Estudante;
import com.eduardo.sistema_estudantes.service.SistemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SistemaController {

    private final SistemaService sistemaService;

    public SistemaController(SistemaService sistemaService) {
        this.sistemaService = sistemaService;
    }


    @GetMapping("/estudantes")
    public List<Estudante> listarEstudantes() {
        return sistemaService.listarEstudantes();
    }

    @PostMapping("/estudantes")
    public Estudante adicionarEstudante(@RequestBody Estudante estudante) {
        return sistemaService.adicionarEstudante(estudante);
    }

    @GetMapping("/estudantes/{matricula}")
    public Estudante buscarPorMatricula(@PathVariable String matricula) {
        return sistemaService.buscarEstudantePorMatricula(matricula);
    }

    @GetMapping("/sistema/info")
    public String infoSistema(){
        return "Sistema: Sistema de Cadastro de Estudantes\n" +
                "Versão : 1.0\n" +
                "Data/Hora: " + java.time.LocalDateTime.now() + "\n" +
                "Status : Operacional";
    }

    @GetMapping("/cursos")
    public List<String> listarCursos() {
        return List.of(
                "Engenharia de Software",
                "Ciência da Computação",
                "Sistemas de Informação",
                "Análise e Desenvolvimento de Sistemas",
                "Engenharia da Computação"
        );
    }

    @GetMapping("/cursos/{id}")
    public String buscarCursoPorId(@PathVariable int id){
        List<String> cursos = List.of(
                "Engenharia de Software",
                "Ciência da Computação",
                "Sistemas de Informação",
                "Análise e Desenvolvimento de Sistemas",
                "Engenharia da Computação"
        );

        if (id >= 1 && id <= cursos.size()) {
            return cursos.get(id - 1);
        } else {
            return "Curso não encontrado";
        }
    }

    @GetMapping("/estudantes/info/{matricula}")
    public String infoEstudante(@PathVariable String matricula) {

        Estudante estudante = sistemaService.buscarEstudantePorMatricula(matricula);

        if (estudante != null) {
            return "Matrícula: " + estudante.getMatricula() + "\n" +
                    "Nome: " + estudante.getNome() + "\n" +
                    "Curso: " + estudante.getCurso() + "\n" +
                    "Semestre: " + estudante.getSemestre();
        } else {
            return "Estudante não encontrado";
        }
    }

    @GetMapping("/estudantes/curso/{curso}")
    public List<Estudante> buscarPorCurso(@PathVariable String curso) {
        return sistemaService.buscarEstudantesPorCurso(curso);
    }

}
