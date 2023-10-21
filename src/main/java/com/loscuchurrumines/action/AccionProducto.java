package com.loscuchurrumines.action;

import org.apache.struts2.ServletActionContext;

import com.loscuchurrumines.repository.RepositorioProducto;
import com.opensymphony.xwork2.ActionSupport;
import com.loscuchurrumines.model.Producto;
import java.util.List;

public class AccionProducto extends ActionSupport{
    List <Producto> productos;
    RepositorioProducto repoProducto = new RepositorioProducto();
    public String execute(){
        productos = repoProducto.obtenerProducto(); 
        ServletActionContext.getRequest().setAttribute("productos", productos);
        return SUCCESS;
    }
    
}
