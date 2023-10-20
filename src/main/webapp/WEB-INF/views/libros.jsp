<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.example.model.Libro" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Libros</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2 class="my-4">Libros en la Biblioteca</h2>

    <table class="table table-striped">
        <thead class="thead-dark">
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
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>