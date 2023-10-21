package com.loscuchurrumines.model;

public class Producto {
    private int codigo;
    private String fotoProducto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public Producto(){

    }

    public Producto (int codigo, String fotoProducto, String nombre, int cantidad, double precioUnitario){
        this.codigo=codigo;
        this.fotoProducto=fotoProducto;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precioUnitario=precioUnitario;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getFotoProducto(){
        return this.fotoProducto;
    }

    public void setFotoProducto(String fotoproducto){
        this.fotoProducto=fotoproducto;
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

    public double getPrecioUnitario(){
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario){
        this.precioUnitario=precioUnitario;
    }


}
