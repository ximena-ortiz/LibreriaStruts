<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Editar Cliente</title>
</head>
<body>
    <h2>Editar Cliente</h2>
    <form action="<%= request.getContextPath() %>/editarCliente.action" method="post">
        <div>
            <label for="cliente.dni">Dni:</label>
            <% 
            String dni = request.getParameter("dni");
            %>
            <input type="text" id="cliente.dni" name="cliente.dni" value="<%= dni %>" />
        </div>
        <div>
            <label for="cliente.foto">Foto Cliente:</label>
            <%
            String foto = request.getParameter("foto");
            %>
            <input type="text" id="cliente.foto" name="cliente.foto" value="<%= foto %>" />
        </div>
        <div>
            <label for="cliente.direccion">Direccion:</label>
            <%
            String direccion = request.getParameter("direccion");
            %>
            <input type="text" id="cliente.direccion" name="cliente.direccion" value="<%= direccion %>" />
        </div>
        <div>
            <label for="cliente.telefono">Telefono:</label>
            <%
            String telefono = request.getParameter("telefono");
            %>
            <input type="text" id="cliente.telefono" name="cliente.telefono" value="<%= telefono %>" />
        </div>
        <div>
            <label for="cliente.email">Email:</label>
            <%
            String email = request.getParameter("email");
            %>
            <input type="text" id="cliente.email" name="cliente.email" value="<%= email %>" />
        </div>
        <input type="submit" value="Editar" />
</body>
</html>