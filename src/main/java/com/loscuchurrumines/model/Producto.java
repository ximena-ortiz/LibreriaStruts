package com.loscuchurrumines.model;

public class Producto {
    private int codigo;
    private String foto;
    private String nombre;
    private int cantidad;
    private double precio;
    private int proveedor;
    private String estado;

    public Producto(){

    }

    public Producto (int codigo, String foto, String nombre, int cantidad, double precio, int proveedor, String estado){
        this.codigo=codigo;
        this.foto=foto;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
        this.proveedor=proveedor;
        this.estado=estado;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado=estado;
    }

    public int getProveedor(){
        return this.proveedor;
    }

    public void setProveedor(int proveedor){
        this.proveedor=proveedor;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getFoto(){
        return this.foto;
    }

    public void setFoto(String foto){
        this.foto=foto;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }


}
