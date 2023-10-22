<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insertar Proveedor</title>
</head>
<body>
    <h2>Añadir nuevo Proveedor</h2>
    <form action="<%= request.getContextPath() %>/insertarProveedor.action" method="post">
        <div>
            <label for="proveedor.codigo">Codigo:</label>
            <input type="text" id="proveedor.codigo" name="proveedor.codigo" />
        </div>
        
        <div>
            <label for="proveedor.foto">Foto:</label>
            <input type="text" id="proveedor.foto" name="proveedor.foto" />
        </div>
        <div>
            <label for="proveedor.nombre">Nombre:</label>
            <input type="text" id="proveedor.nombre" name="proveedor.nombre" />
        </div>
        <div>
            <label for="proveedor.telefono">Teléfono:</label>
            <input type="text" id="proveedor.telefono" name="proveedor.telefono" />
        </div>
        <input type="submit" value="Insertar" />
</body>
</html>