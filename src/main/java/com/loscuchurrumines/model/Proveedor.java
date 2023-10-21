package com.loscuchurrumines.model;

public class Proveedor {
    private int codigo;
    private String fotoProveedor;
    private String nombre;
    private String telefono;

    public Proveedor(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFotoProveedor() {
        return fotoProveedor;
    }

    public void setFotoProveedor(String fotoProveedor) {
        this.fotoProveedor = fotoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
