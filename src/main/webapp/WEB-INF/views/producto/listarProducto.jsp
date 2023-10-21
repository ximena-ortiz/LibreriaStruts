<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.loscuchurrumines.model.Producto" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Productos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2 class="my-4">Lista de Productos</h2>

    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th>Codigo</th>
                <th>Foto</th>
                <th>Nombre</th>
                <th>Cantidad</th>
                <th>Precio Unitario</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<Producto> productos = (List<Producto>) request.getAttribute("productos");
                //instancia y nombre del vector
            for(Producto producto : productos) {
            %>
            <tr>
                <td><%= producto.getCodigo() %></td>
                <td><img src = "<%= producto.getFotoProducto() %>" alt="foto producto" width="100" height="100"></td>
                <td><%= producto.getNombre() %></td>
                <td><%= producto.getCantidad() %></td>
                <td><%= producto.getPrecioUnitario() %></td>
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