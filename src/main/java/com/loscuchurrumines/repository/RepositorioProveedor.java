package com.loscuchurrumines.repository;
import com.loscuchurrumines.model.Proveedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.loscuchurrumines.model.ConexionDB;

public class RepositorioProveedor {
    public List<Proveedor> obtenerProveedor(){
        List<Proveedor> proveedores = new ArrayList<>();
        String query = "select * from tbproveedores";
        try{
            Connection con = ConexionDB.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                Proveedor proveedor = new Proveedor();
                proveedor.setCodigo(rs.getInt("codigo"));
                proveedor.setFoto(rs.getString("fotoproveedor"));
                proveedor.setNombre(rs.getString("nombre"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedores.add(proveedor);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return proveedores;
    }

    public void insertarProveedor(Proveedor proveedor){
        String query = "INSERT INTO tbproveedores (codigo, fotoproveedor, nombre, telefono) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, proveedor.getCodigo());
            stmt.setString(2, proveedor.getFoto());
            stmt.setString(3, proveedor.getNombre());
            stmt.setString(4, proveedor.getTelefono());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
