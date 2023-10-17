package com.schoolmanager.api.model;

import java.util.ArrayList;

public class Student extends User {

    private Class Class;
    private ArrayList<Prova>listaDeProvas = new ArrayList<>();

    public Student(String nome, int idade, String endereco, String registro) {
        super(nome, idade, endereco,registro);
    }


}
