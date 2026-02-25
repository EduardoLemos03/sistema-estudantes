package com.eduardo.sistema_estudantes.model;

public class Curso {
    private Long id;
    private String nome;

    public Curso (Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
