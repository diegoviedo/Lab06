<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Se logro el logine</title>
</head>
<body>
				
			<h1>Se ha iniciado una sesion con los siguientes datos</h1>
			<h1>ID :misesion.getId());</h1>
			
			//resp.getWriter().println("-------------------------------------------------------------");
			resp.getWriter().println("Nombre : " + misesion.getAttribute("nombre"));
			resp.getWriter().println("Email : " + misesion.getAttribute("email"));
			resp.getWriter().println("Inicio : " + misesion.getAttribute("inicio"));
			<a href='calculadora.jsp'>USA LA CALCULADORA</a>"

</body>
</html>