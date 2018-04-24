<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ProyectoConectorJDBCServlet" method="post">
<h1>Create</h1>

<p><label for="txtidautor">Id Autor:</label> <input id="txtidautor" type="text" name="txtidautor"> </p>
<label for="txtnombre">Nombre Autor:</label> <input id="txtnombre" type="text" name="txtnombre"> </p>
<label for="txtapellido">Apellido Autor:</label> <input id="txtapellido" type="text" name="txtapellido"> </p>
<label for="txtdomicilio">Domicilio Autor:</label> <input id="txtdomicilio" type="text" name="txtdomicilio"> </p>
<label for="txttelefono">Telefono Autor:</label> <input id="txttelefono" type="text" name="txttelefono"> </p>
<label for="txtsalario">Salario Autor:</label> <input id="txtsalario" type="text" name="txtsalario"> </p>
<input type="submit" value="Da clic">
</form>

</body>
</html>