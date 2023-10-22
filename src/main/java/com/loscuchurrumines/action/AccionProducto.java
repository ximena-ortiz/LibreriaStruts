package com.loscuchurrumines.action;

import org.apache.struts2.ServletActionContext;

import com.loscuchurrumines.repository.RepositorioProducto;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.loscuchurrumines.model.Producto;
import java.util.List;

public class AccionProducto extends ActionSupport implements ModelDriven<Producto>{
    List <Producto> productos;
    private Producto producto = new Producto();
    RepositorioProducto repoProducto = new RepositorioProducto();

    @Override
    public Producto getModel(){
        return producto;
    }

    public String execute(){
        productos = repoProducto.obtenerProducto(); 
        ServletActionContext.getRequest().setAttribute("productos", productos);
        return SUCCESS;
    }

    public String insert(){
        if(producto != null){
            repoProducto.insertarProducto(producto);
            return SUCCESS;
        }
        return ERROR;
    }

    public Producto getProducto(){
        return producto;
    }

    public void setProducto(Producto producto){
        this.producto = producto;
    }
    
}
