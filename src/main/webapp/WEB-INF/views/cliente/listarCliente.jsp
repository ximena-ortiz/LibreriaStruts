<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.loscuchurrumines.model.Cliente" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Libros</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2 class="my-4">Lista de Clientes </h2>

    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th>DNI</th>
                <th>Foto</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");
                //instancia y nombre del vector
            for(Cliente cliente : clientes) {
            %>
            <tr>
                <td><%= cliente.getDni() %></td>
                <td><%= cliente.getFotoCliente() %></td>
                <td><%= cliente.getDireccion() %></td>
                <td><%= cliente.getTelefono() %></td>
                <td><%= cliente.getEmail() %></td>
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