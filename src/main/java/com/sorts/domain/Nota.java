package com.sorts.domain;

public class Nota {

    private String name;
    private Double nota;

    public Nota(String name, Double nota) {
        this.name = name;
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    public Double getNota() {
        return nota;
    }

}
