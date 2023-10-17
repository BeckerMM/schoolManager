package com.schoolmanager.api.model;

import java.util.ArrayList;

public class Professor extends User {
    private Discipline discipline;
    private Class aClass;
    private ArrayList<Prova> listaDeProvas;

    public Professor(String name, int age, String address, String password) {
        super(name, age, address, password);
    }

}
