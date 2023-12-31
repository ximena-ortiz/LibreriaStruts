<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.loscuchurrumines.model.Empleado" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Libros</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2 class="my-4">Lista de Empleados</h2>

    <a href="formularioEmpleado.action">Agregar</a><br><br>


    <table class="table table-striped">
        <thead class="thead-dark">
            <tr>
                <th>DNI</th>
                <th>Foto</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Email</th>
                <th>Clave</th>
                <th>Estado</th>
                <th>Operaciones</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<Empleado> empleados = (List<Empleado>) request.getAttribute("empleados");
                //instancia y nombre del vector
            for(Empleado empleado : empleados) {
            %>
            <tr>
                <td><%= empleado.getDni() %></td>
                <td><img src = "<%= empleado.getFoto() %>" alt="foto empleado" width="100" height="100"></td>
                <td><%= empleado.getDireccion() %></td>
                <td><%= empleado.getTelefono() %></td>
                <td><%= empleado.getEmail() %></td>
                <td><%= empleado.getClave() %></td>
                <td><%= empleado.getEstado() %></td>
                <td>
                    <a href="formularioEditarEmpleado.action?dni=<%= empleado.getDni()%>&foto=<%= empleado.getFoto()%>&direccion=<%= empleado.getDireccion()%>&email=<%= empleado.getEmail()%>&telefono=<%= empleado.getTelefono()%>&clave=<%= empleado.getClave()%>&estado=<%=empleado.getEstado()%>">Editar</a>

                    <a href="eliminarEmpleado.action?dni=<%= empleado.getDni() %>">Eliminar</a>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
    <a href="index.jsp">Volver</a>


</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>