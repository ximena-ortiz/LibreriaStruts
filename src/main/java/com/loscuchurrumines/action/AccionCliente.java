package com.loscuchurrumines.action;

import com.opensymphony.xwork2.ActionSupport;
import com.loscuchurrumines.model.Cliente;
import com.loscuchurrumines.repository.RepositorioCliente;
import java.util.List;

import org.apache.struts2.ServletActionContext;

public class AccionCliente extends ActionSupport {
    List <Cliente> clientes;
    RepositorioCliente repoCliente = new RepositorioCliente();
    public String execute(){
        //instancia y metodo , para usar metodo siempre hay instancia
        clientes = repoCliente.obtenerClientes();
        ServletActionContext.getRequest().setAttribute("clientes", clientes);
        //STRUTS?
        return SUCCESS;
    }
    
}
