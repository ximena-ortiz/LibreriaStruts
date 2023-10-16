<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.loscuchurrumines.model.Libro" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Libros</title>
</head>
<body>

<h2>Libros en la Biblioteca</h2>

<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Autor</th>
            <th>Categoría</th>
        </tr>
    </thead>
    <tbody>
        <% 
        List<Libro> libros = (List<Libro>) request.getAttribute("libros");
        for(Libro libro : libros) {
        %>
        <tr>
            <td><%= libro.getId() %></td>
            <td><%= libro.getNombre() %></td>
            <td><%= libro.getAutor() %></td>
            <td><%= libro.getCategoria() %></td>
        </tr>
        <% } %>
    </tbody>
</table>

</body>
</html>