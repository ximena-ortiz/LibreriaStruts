package com.loscuchurrumines.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.loscuchurrumines.model.Libro;
import com.loscuchurrumines.repository.RepositorioLibro;
import com.opensymphony.xwork2.ActionSupport;

public class AccionLibro extends ActionSupport {
    private List<Libro> libros;
    private RepositorioLibro repoLibro = new RepositorioLibro();

    public String execute(){
        libros = repoLibro.obtenerLibros();
        ServletActionContext.getRequest().setAttribute("libros", libros);
        return SUCCESS;
    }

    public List<Libro> getLibros(){
        return libros;
    }
    
}
