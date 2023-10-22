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
                producto.setProveedor(rs.getInt("fkproveedor"));
                productos.add(producto);
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return productos;
    }

    public void insertarProducto(Producto producto){
        String query = "INSERT INTO tbproducto (fotoproducto, nombre, cantidad, prunitario, estado, fkproveedor) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = ConexionDB.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, producto.getFoto());
            stmt.setString(2, producto.getNombre());
            stmt.setInt(3, producto.getCantidad());
            stmt.setDouble(4, producto.getPrecio());
            stmt.setString(5,"A");
            stmt.setInt(6, producto.getProveedor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    public void actualizarProducto(Producto producto){
        String query = "UPDATE tbproducto SET fotoproducto = ?, nombre = ?, cantidad = ?, prunitario = ? ,fkproveedor = ?, estado = ? WHERE codigo = ?";
        try (Connection con = ConexionDB.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, producto.getFoto());
            stmt.setString(2, producto.getNombre());
            stmt.setInt(3, producto.getCantidad());
            stmt.setDouble(4, producto.getPrecio());
            stmt.setInt(5, producto.getProveedor());
            stmt.setString(6, producto.getEstado());
            stmt.setInt(7, producto.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public boolean eliminarProducto(int codigo){
            String query = "DELETE FROM tbproducto WHERE codigo = ?";
            try (Connection con = ConexionDB.getConnection()) {
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, codigo);
                stmt.executeUpdate();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
    }
}
