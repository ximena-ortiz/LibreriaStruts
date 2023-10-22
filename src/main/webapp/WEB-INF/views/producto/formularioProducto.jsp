<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insertar Producto</title>
</head>
<body>
    <h2>Añadir nuevo producto</h2>
    <form action="<%= request.getContextPath() %>/insertarProducto.action" method="post">
        <div>
            <label for="producto.codigo">Codigo:</label>
            <input type="text" id="producto.codigo" name="producto.codigo" />
        </div>
        <div>
            <label for="producto.foto">Foto Producto:</label>
            <input type="text" id="producto.foto" name="producto.foto" />
        </div>
        <div>
            <label for="producto.nombre">Nombre:</label>
            <input type="text" id="producto.nombre" name="producto.nombre" />
        </div>
        <div>
            <label for="producto.cantidad">Cantidad:</label>
            <input type="text" id="producto.cantidad" name="producto.cantidad" />
        </div>
        <div>
            <label for="producto.precio">Precio:</label>
            <input type="text" id="producto.precio" name="producto.precio" />
        </div>
        <div>
            <label for="producto.proveedor">Proveedor:</label>
            <input type="text" id="producto.proveedor" name="producto.proveedor" />
        </div>
        <input type="submit" value="Insertar" />
    </form>
</body>