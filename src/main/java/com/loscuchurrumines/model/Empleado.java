package com.loscuchurrumines.model;

public class Empleado {
    private String dni;
    private String foto;
    private String direccion;
    private String email;
    private String telefono;

    public Empleado(){

    }

    public Empleado(String dni, String foto, String direccion, String email, String telefono){
        this.dni=dni;
        this.foto=foto;
        this.direccion=direccion;
        this.email=email;
        this.telefono=telefono;
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
