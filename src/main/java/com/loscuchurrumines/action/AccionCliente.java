package com.loscuchurrumines.action;

import com.opensymphony.xwork2.ActionSupport;
import com.loscuchurrumines.model.Cliente;
import com.loscuchurrumines.repository.RepositorioCliente;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;

import org.apache.struts2.ServletActionContext;

public class AccionCliente extends ActionSupport implements ModelDriven<Cliente> {
    List <Cliente> clientes;
    private Cliente cliente = new Cliente();
    RepositorioCliente repoCliente = new RepositorioCliente();

    @Override
    public Cliente getModel(){
        return cliente;
    }

    public String execute(){
        //instancia y metodo , para usar metodo siempre hay instancia
        clientes = repoCliente.obtenerClientes();
        ServletActionContext.getRequest().setAttribute("clientes", clientes);
        //STRUTS?
        return SUCCESS;
    }

    public String insert(){
        if(cliente != null){
            repoCliente.insertarCliente(cliente);
            return SUCCESS;
        }
        return ERROR;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String update(){
        if(cliente != null){
            repoCliente.actualizarCliente(cliente);
            return SUCCESS;
        }
        return ERROR;
    }

    public String delete(){
        if(cliente != null){
            repoCliente.eliminarCliente(cliente.getDni());
            return SUCCESS;
        }
        return ERROR;
    }
    
}
