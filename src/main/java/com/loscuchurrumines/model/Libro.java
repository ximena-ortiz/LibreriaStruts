package com.loscuchurrumines.model;

public class Libro {
    private int id;
    private String nombre;
    private String autor;
    private String categoria;

    public Libro() {
    }
    public Libro(int id, String nombre, String autor, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}