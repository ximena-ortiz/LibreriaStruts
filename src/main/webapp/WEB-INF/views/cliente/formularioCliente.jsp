<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insertar Cliente</title>
</head>
<body>
    <h2>Añadir nuevo cliente</h2>
    <form action="<%= request.getContextPath() %>/insertarCliente.action" method="post">
        <div>
            <label for="cliente.dni">DNI:</label>
            <input type="text" id="cliente.dni" name="cliente.dni" />
        </div>
        
        <div>
            <label for="cliente.direccion">Dirección:</label>
            <input type="text" id="cliente.direccion" name="cliente.direccion" />
        </div>
        <div>
            <label for="cliente.email">Email:</label>
            <input type="text" id="cliente.email" name="cliente.email" />
        </div>
        <div>
            <label for="cliente.telefono">Teléfono:</label>
            <input type="text" id="cliente.telefono" name="cliente.telefono" />
        </div>
        <div>
            <label for="cliente.foto">Foto Cliente:</label>
            <input type="text" id="cliente.foto" name="cliente.foto" />
        </div>
        <input type="submit" value="Insertar" />
    </form>
</html>