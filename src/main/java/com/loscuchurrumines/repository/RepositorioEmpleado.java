package com.loscuchurrumines.repository;
import com.loscuchurrumines.model.Empleado;
import com.loscuchurrumines.model.ConexionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioEmpleado {
    public List<Empleado> obtenerEmpleados(){
        List<Empleado> empleados = new ArrayList<>();
        String query = "select * from tbempleado";
        try{
            Connection con = ConexionDB.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Empleado empleado = new Empleado();
                empleado.setDni(rs.getString("dni"));
                empleado.setFoto(rs.getString("fotoempleado"));
                empleado.setDireccion(rs.getString("direccion"));
                empleado.setEmail(rs.getString("email"));
                empleado.setTelefono(rs.getString("telefono"));
                empleado.setClave(rs.getString("clave"));
                empleado.setEstado(rs.getString("estado"));
                empleados.add(empleado);
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return empleados;
    } 

    public void insertarEmpleado(Empleado empleado) {
        String query = "INSERT INTO tbempleado (dni, fotoempleado, direccion, email, telefono, clave, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, empleado.getDni());
            stmt.setString(2, empleado.getFoto());
             //"imprimir fotoempleado";
            stmt.setString(3, empleado.getDireccion());
            stmt.setString(4, empleado.getEmail());
            stmt.setString(5, empleado.getTelefono());
            stmt.setString(6, empleado.getClave());
            stmt.setString(7, empleado.getEstado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarEmpleado(Empleado empleado) {
        String query = "UPDATE tbempleado SET fotoempleado = ?, direccion = ?, email = ?, telefono = ?, clave=?, estado=? WHERE dni = ?";
        try (Connection con = ConexionDB.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, empleado.getFoto());
            stmt.setString(2, empleado.getDireccion());
            stmt.setString(3, empleado.getEmail());
            stmt.setString(4, empleado.getTelefono());
            stmt.setString(5, empleado.getClave());
            stmt.setString(6, empleado.getEstado());
            stmt.setString(7, empleado.getDni());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public boolean eliminarEmpleado(String dni) {
            String query = "DELETE FROM tbempleado WHERE dni = ?";
            try (Connection con = ConexionDB.getConnection()) {
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, dni);
                stmt.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
    
}