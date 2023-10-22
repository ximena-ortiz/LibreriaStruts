<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Editar Proveedor</title>
</head>
<body>
    <h2>Editar Proveedor</h2>
    <form action="<%= request.getContextPath() %>/editarProveedor.action" method="post">
        <div>
            <label for="proveedor.codigo">Codigo:</label>
            <%
            String codigo = request.getParameter("codigo");
            %>
            <input type="text" id="proveedor.codigo" name="proveedor.codigo" value="<%= codigo %>" />
        </div>
        <div>
            <label for="proveedor.foto">Foto Proveedor:</label>
            <%
            String foto = request.getParameter("foto");
            %>
            <input type="text" id="proveedor.foto" name="proveedor.foto" value="<%= foto %>" />
        </div>
        <div>
            <label for="proveedor.nombre">Nombre:</label>
            <%
            String nombre = request.getParameter("nombre");
            %>
            <input type="text" id="proveedor.nombre" name="proveedor.nombre" value="<%= nombre %>" />
        </div>
        <div>
            <label for="proveedor.telefono">Telefono:</label>
            <%
            String telefono = request.getParameter("telefono");
            %>
            <input type="text" id="proveedor.telefono" name="proveedor.telefono" value="<%= telefono %>" />
        </div>
        <input type="submit" value="Editar" />
</body>
</html>