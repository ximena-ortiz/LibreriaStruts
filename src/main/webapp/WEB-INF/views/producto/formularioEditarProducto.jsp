<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Editar Producto</title>
</head>
<body>
    <h2>Editar producto</h2>
    <form action="<%= request.getContextPath() %>/editarProducto.action" method="post">
        <div>
            <label for="producto.codigo">Codigo:</label>
            <% 
            Integer codigo = Integer.parseInt(request.getParameter("codigo"));
            %>
            <input type="text" id="producto.codigo" name="producto.codigo" value="<%= codigo %>" />
        </div>
        <div>
            <label for="producto.foto">Foto Producto:</label>
            <%
            String foto = request.getParameter("foto");
            %>
            <input type="text" id="producto.foto" name="producto.foto" value="<%= foto %>" />
        </div>
        <div>
            <label for="producto.nombre">Nombre:</label>
            <%
            String nombre = request.getParameter("nombre");
            %>
            <input type="text" id="producto.nombre" name="producto.nombre" value="<%= nombre %>" />
        </div>
        <div>
            <label for="producto.cantidad">Cantidad:</label>
            <%
            Integer cantidad = Integer.parseInt(request.getParameter("cantidad"));
            %>
            <input type="text" id="producto.cantidad" name="producto.cantidad" value="<%= cantidad %>"/>
        </div>
        <div>
            <label for="producto.precio">Precio:</label>
            <%
            Double precio = Double.parseDouble(request.getParameter("precio"));
            %>
            <input type="text" id="producto.precio" name="producto.precio" value="<%= precio %>" />
        </div>
        <div>
            <label for="producto.proveedor">Proveedor:</label>
            <%
            Integer proveedor = Integer.parseInt(request.getParameter("proveedor"));
            %>
            <input type="text" id="producto.proveedor" name="producto.proveedor" value="<%= proveedor %>" />
        </div>
        <div>
            <label for="producto.estado">Estado:</label>
            <input type="text" id="producto.estado" name="producto.estado" />
        </div>
        <input type="submit" value="Editar" />
</body>
</html>