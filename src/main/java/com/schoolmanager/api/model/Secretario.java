package com.schoolmanager.api.model;

public class Secretario extends User {
    private int qtdDeBoletinsGerado;

    public Secretario(String nome, int idade,  String endereco,String registro ) {
        super(nome, idade, endereco,registro);
        this.qtdDeBoletinsGerado = 0;
    }

    public void cadastraDisciplina( int codDisciplina, int cargaHoraria){
        new Discipline(codDisciplina, cargaHoraria);
    }
}
