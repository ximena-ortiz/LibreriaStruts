<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.loscuchurrumines.model.Proveedor" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Proveedores</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2 class="my-4">Lista de Proveedores</h2>

    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th>Codigo</th>
                <th>Foto</th>
                <th>Nombre</th>
                <th>Telefono</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<Proveedor> proveedores = (List<Proveedor>) request.getAttribute("proveedores");
                //instancia y nombre del vector
            for(Proveedor proveedor : proveedores) {
            %>
            <tr>
                <td><%= proveedor.getCodigo() %></td>
                <td><img src = "<%= proveedor.getFoto() %>" alt="foto proveedor" width="100" height="100"></td>
                <td><%= proveedor.getNombre() %></td>
                <td><%= proveedor.getTelefono() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
    <a href="formularioProveedor.action">Agregar</a>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>