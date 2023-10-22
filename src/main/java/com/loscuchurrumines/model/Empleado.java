package com.loscuchurrumines.model;

public class Empleado {
    private String dni;
    private String foto;
    private String direccion;
    private String email;
    private String telefono;
    private String clave;
    private String estado;

    public Empleado(){

    }

    public Empleado(String dni, String foto, String direccion, String email, String telefono, String clave, String estado){
        this.dni=dni;
        this.foto=foto;
        this.direccion=direccion;
        this.email=email;
        this.telefono=telefono;
        this.clave=clave;
        this.estado=estado;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave=clave;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado=estado;
    }   

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
