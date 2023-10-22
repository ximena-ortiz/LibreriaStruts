package com.loscuchurrumines.model;

public class Cliente {
    private String dni;
    private String foto;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente() {

    }

    public Cliente (String dni, String foto, String direccion, String telefono, String email){
        this.dni=dni;
        this.foto = foto;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
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

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail (){
        return this.email;
    }

    public void setEmail(String email){
        this.email=email;
    }

}
