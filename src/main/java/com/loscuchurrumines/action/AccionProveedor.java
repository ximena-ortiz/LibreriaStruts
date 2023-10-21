package com.loscuchurrumines.action;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.loscuchurrumines.model.Proveedor;
import com.loscuchurrumines.repository.RepositorioProveedor;
import com.opensymphony.xwork2.ActionSupport;

public class AccionProveedor extends ActionSupport {
    List <Proveedor> proveedores;
    RepositorioProveedor repoProveedor = new RepositorioProveedor();
    public String execute(){
        proveedores = repoProveedor.obtenerProveedor();
        ServletActionContext.getRequest().setAttribute("proveedores", proveedores);
        return SUCCESS;
    }

    
}
