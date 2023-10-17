package com.schoolmanager.api.model;

import java.util.ArrayList;

public class Discipline {

    private String name;
    private Integer id;
    private Integer workload;

    public Discipline(String name, Integer id, Integer workload) {
        this.name = name;
        this.id = id;
        this.workload = workload;
    }

    public Discipline(Integer id, Integer workload) {
        this.id = id;
        this.workload = workload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }
}
