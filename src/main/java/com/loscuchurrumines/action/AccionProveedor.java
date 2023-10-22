package com.loscuchurrumines.action;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.loscuchurrumines.model.Proveedor;
import com.loscuchurrumines.repository.RepositorioProveedor;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AccionProveedor extends ActionSupport implements ModelDriven<Proveedor> {
    List <Proveedor> proveedores;
    private Proveedor proveedor = new Proveedor();
    RepositorioProveedor repoProveedor = new RepositorioProveedor();

    @Override
    public Proveedor getModel(){
        return proveedor;
    }

    public String execute(){
        proveedores = repoProveedor.obtenerProveedor();
        ServletActionContext.getRequest().setAttribute("proveedores", proveedores);
        return SUCCESS;
    }

    public String insert(){
        if(proveedor != null){
            repoProveedor.insertarProveedor(proveedor);
            return SUCCESS;
        }
        return ERROR;
    }

    public Proveedor getProveedor(){
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }

    public String update(){
        if(proveedor != null){
            repoProveedor.actualizarProveedor(proveedor);
            return SUCCESS;
        }
        return ERROR;
    }

    public String delete(){
        if(proveedor != null){
            repoProveedor.eliminarProveedor(proveedor.getCodigo());
            return SUCCESS;
        }
        return ERROR;
    }
}
