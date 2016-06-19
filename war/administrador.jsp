<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>      
<%
	String gmail=(String)request.getAttribute("gmail");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administrador de cuentas y permisos</title>
</head>
<body>
<br>
Hola Ingresaste a la pagina Administrador
	<form action="registerUser" method="get">
		<label for="nombre" >Ejemplo de nombre de Usuario: Gandalf,Aragorn,Bilbo,Frodo,Gollum,Legolas,Gimli,Pippin,Merry Otros</label><br>
		Nombre de Usuario: <input type="text" name="nombre" value="usuario"><br>
		Gmail de Usuario: <input type="text" name="gmail" value="gmail"><br>
		Tipo de Usuario: <select name="tipo" size="1">
			<option value="Guerreros" >Guerrero</option>
			<option value="Magos" >Mago</option>
			<option value="Hobbits" >Hobbit</option>
			<option value="Visitantes" >Visitante</option>
			<!-- Otros tipos agregar ... -->
			
			
			
			<!-- Recursos (Ejemplo de recursos)
									Armas		El Anillo		Jamón		Diplomacia		Cerveza
				Magos 				x			x				x			x				x
				Guerreros			x							x			x				x
				Hobbits							x
				Visitante(Golum)				x
			-->
		</select><br>
		
		<button type="submit">Guardar</button>
	</form>
	
	<br>
	<a href="permisos.jsp"> Administrar Permisos </a>
</body>
</html>