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
                producto.setFotoProducto(rs.getString("fotoproducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecioUnitario(rs.getDouble("prunitario"));
                productos.add(producto);
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return productos;
    }
    
    
}
