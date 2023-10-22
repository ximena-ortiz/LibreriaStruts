<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Editar Empleado</title>
</head>
<body>
    <h2>Editar Empleado</h2>
    <form action="<%= request.getContextPath() %>/editarEmpleado.action" method="post">
        <div>
            <label for="empleado.dni">Dni:</label>
            <%
            String dni = request.getParameter("dni");
            %>
            <input type="text" id="empleado.dni" name="empleado.dni" value="<%= dni %>" />
        </div>
        <div>
            <label for="empleado.foto">Foto Empleado:</label>
            <%
            String foto = request.getParameter("foto");
            %>
            <input type="text" id="empleado.foto" name="empleado.foto" value="<%= foto %>" />
        </div>
        <div>
            <label for="empleado.direccion">Direccion:</label>
            <%
            String direccion = request.getParameter("direccion");
            %>
            <input type="text" id="empleado.direccion" name="empleado.direccion" value="<%= direccion %>" />
        </div>
        <div>
            <label for="empleado.email">Email:</label>
            <%
            String email = request.getParameter("email");
            %>
            <input type="text" id="empleado.email" name="empleado.email" value="<%= email %>" />
        </div>
        <div>
            <label for="empleado.telefono">Telefono:</label>
            <%
            String telefono = request.getParameter("telefono");
            %>
            <input type="text" id="empleado.telefono" name="empleado.telefono" value="<%= telefono %>" />
        </div>
        <div>
            <label for="empleado.clave">Clave:</label>
            <%
            String clave = request.getParameter("clave");
            %>
            <input type="text" id="empleado.clave" name="empleado.clave" value="<%= clave %>" />
        </div>
        <div>
            <label for="empleado.estado">Estado:</label>
            <%
            String estado = request.getParameter("estado");
            %>
            <input type="text" id="empleado.estado" name="empleado.estado" value="<%= estado %>" />
        </div>
        
        <input type="submit" value="Editar" />
</html>