package com.schoolmanager.api.model;

public class Class {
    private Integer id;
    private String className;
    private Professor professor;

    public Class(Integer id, String className, Professor professor) {
        this.id = id;
        this.className = className;
        this.professor = professor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
