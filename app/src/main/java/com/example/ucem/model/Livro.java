package com.example.ucem.model;

public class Livro {

    public Livro(String tituloCapitulo, String numeroCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
        this.numeroCapitulo = numeroCapitulo;

    }

    private String tituloCapitulo;
    private String numeroCapitulo;


    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }

    public String getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(String numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }



}
