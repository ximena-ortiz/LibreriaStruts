package com.loscuchurrumines.action;

import com.loscuchurrumines.repository.RepositorioEmpleado;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.loscuchurrumines.model.Empleado;

public class AccionEmpleado extends ActionSupport implements ModelDriven<Empleado> {
    List<Empleado> empleados;
    private Empleado empleado = new Empleado();
    RepositorioEmpleado repoEmpleado = new RepositorioEmpleado();

    @Override
    public Empleado getModel() {
        return empleado;
    }

    public String execute() {
        empleados = repoEmpleado.obtenerEmpleados();
        ServletActionContext.getRequest().setAttribute("empleados", empleados);

        return SUCCESS;
    }

    public String insert() {
        if (empleado != null) {
            repoEmpleado.insertarEmpleado(empleado);
            //System.out.println(empleado.getDireccion() );
            //System.out.println(empleado.getfoto() );
            //System.out.println(empleado.getTelefono() );
            // System.out.println(empleado.getEmail() );
            // System.out.println(empleado.getDni() );

            return SUCCESS;
        }
        return ERROR;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}