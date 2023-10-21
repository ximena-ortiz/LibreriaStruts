<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insertar Empleado</title>
</head>
<body>
    <h2>Añadir nuevo empleado</h2>
    <form action="<%= request.getContextPath() %>/insertarEmpleado.action" method="post">
        <div>
            <label for="empleado.dni">DNI:</label>
            <input type="text" id="empleado.dni" name="empleado.dni" />
        </div>
        
        <div>
            <label for="empleado.direccion">Dirección:</label>
            <input type="text" id="empleado.direccion" name="empleado.direccion" />
        </div>
        <div>
            <label for="empleado.email">Email:</label>
            <input type="text" id="empleado.email" name="empleado.email" />
        </div>
        <div>
            <label for="empleado.telefono">Teléfono:</label>
            <input type="text" id="empleado.telefono" name="empleado.telefono" />
        </div>
        <div>
            <label for="empleado.foto">Foto Empleado:</label>
            <input type="text" id="empleado.foto" name="empleado.foto" />
        </div>
        <input type="submit" value="Insertar" />
    </form>
    
</body>
</html>