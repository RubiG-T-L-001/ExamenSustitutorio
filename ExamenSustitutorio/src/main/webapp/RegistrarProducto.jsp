<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#c5dec9">
    <h1 align="center">Registrar Producto</h1>
    <form action="ControladorProducto" method="post">
        <table border="2" align="center">
            <tr>
                <td>Nombre del Producto</td>
                <td><input type="text" name="nombresusti" required></td>
            </tr>
            <tr>
                <td>Precio de Compra</td>
                <td><input type="text" name="preciocompsusti" required></td>
            </tr>
            <tr>
                <td>Precio de Venta</td>
                <td><input type="text" name="precioventasusti" required></td>
            </tr>
            <tr>
                <td>Estado</td>
                <td><input type="text" name="estadosusti" required>
                
                </td>
            </tr>
            <tr>
                <td>Descripci�n</td>
                <td><input type="text" name="descripsusti" required></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Ingresar Producto">
                </td>
            </tr>
        </table>
    </form>

    <h2 align="center">Listado de Productos</h2>
    <table border="2" align="center">
        <thead>
            <tr>
                <th>C�digo</th>
                <th>Nombre</th>
                <th>Precio de Compra</th>
                <th>Precio de Venta</th>
                <th>Estado</th>
                <th>Descripci�n</th>
            </tr>
        </thead>
        <tbody>
            <%
            List<TblProductosusti> listado = (List<TblProductosusti>) request.getAttribute("listado");
            
            // Aplicamos una condici�n...
            if (listado != null) {
                // Aplicamos un bucle
                for (TblProductosusti lis : listado) {
            %>
                <tr>
                    <td><%= lis.getIdproductosusti() %></td>
                    <td><%= lis.getNombresusti() %></td>
                    <td><%= lis.getPreciocompsusti() %></td>
                    <td><%= lis.getPrecioventasusti() %></td>
                    <td><%= lis.getEstadosusti() %></td>
                    <td><%= lis.getDescripsusti() %></td>
                </tr>
            <%
                }
            } else {
            %>
                <tr>
                    <td colspan="6" align="center">No hay productos registrados.</td>
                </tr>
            <%
            }
            %>
        </tbody>
    </table>
</body>

</html>