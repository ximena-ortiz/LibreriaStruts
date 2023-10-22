package com.loscuchurrumines.repository;
import com.loscuchurrumines.model.Producto;
import com.loscuchurrumines.model.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProducto {
    public List<Producto> obtenerProducto(){
        List<Producto> productos = new ArrayList<>();
        String query = "select * from tbproducto";
        try{
            Connection con = ConexionDB.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setFoto(rs.getString("fotoproducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("prunitario"));
                productos.add(producto);
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return productos;
    }

    public void insertarProducto(Producto producto){
        String query = "INSERT INTO tbproducto (codigo, fotoproducto, nombre, cantidad, prunitario) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, producto.getCodigo());
            stmt.setString(2, producto.getFoto());
            stmt.setString(3, producto.getNombre());
            stmt.setInt(4, producto.getCantidad());
            stmt.setDouble(5, producto.getPrecio());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}
