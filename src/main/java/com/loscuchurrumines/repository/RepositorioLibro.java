package com.loscuchurrumines.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.loscuchurrumines.model.ConexionDB;
import com.loscuchurrumines.model.Libro;

public class RepositorioLibro {
    public List<Libro> obtenerLibros(){
        List<Libro> libros = new ArrayList<>();
        String query = "Select * from libro";

        try{
            Connection con = ConexionDB.getConnection();
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Libro libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setNombre(rs.getString("nombre"));
                libro.setAutor(rs.getString("autor"));
                libro.setCategoria(rs.getString("categoria"));

                libros.add(libro);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return libros;
    }
}
