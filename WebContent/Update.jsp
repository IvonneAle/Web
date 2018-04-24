<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>

<h1>Update</h1>

<form id="frmupdate" action="UpdateAutorServlet" method="post">

		<p>
			<label for="txtIdAutor">Id Autor: </label>
			<input type="text" id="txtIdAutor" name="txtIdAutor" >
		</p>
		<p>
			<input type="submit" value="Busca Autor">
		</p>
	</form>
</body>
</html>