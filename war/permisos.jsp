<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="registerPermiso" method="get">
			Tipo vs Recurso <br>
			<input type="text"  name="Guerrero" value="Guerrero">
				Armas-----<input type="checkbox" name="GuerreroCheck" value="Armas" checked> 
  				El Anillo-<input type="checkbox" name="GuerreroCheck" value="El Anillo" > 
  				Jamón-----<input type="checkbox" name="GuerreroCheck" value="Jamón" checked>
  				Diplomacia<input type="checkbox" name="GuerreroCheck" value="Diplomacia" checked>
  				Cerveza---<input type="checkbox" name="GuerreroCheck" value="Cerveza" checked> <br>
			<input type="text"  name="Mago" value="Mago">
				Armas-----<input type="checkbox" name="MagoCheck" value="Armas" checked>  
  				El Anillo-<input type="checkbox" name="MagoCheck" value="El Anillo" checked> 
  				Jamón-----<input type="checkbox" name="MagoCheck" value="Jamón" checked>
  				Diplomacia<input type="checkbox" name="MagoCheck" value="Diplomacia" checked>
  				Cerveza---<input type="checkbox" name="MagoCheck" value="Cerveza" checked> <br>
			<input type="text"  name="Hobbit" value="Hobbit">
				Armas-----<input type="checkbox" name="HobbitCheck" value="Armas"> 
  				El Anillo-<input type="checkbox" name="HobbitCheck" value="El Anillo" checked> 
  				Jamón-----<input type="checkbox" name="HobbitCheck" value="Jamón" checked>
  				Diplomacia<input type="checkbox" name="HobbitCheck" value="Diplomacia" >
  				Cerveza---<input type="checkbox" name="HobbitCheck" value="Cerveza" > <br>
			<input type="text"  name="Visitante" value="Visitante">
				Armas-----<input type="checkbox" name="VisitanteCheck" value="Armas"> 
  				El Anillo-<input type="checkbox" name="VisitanteCheck" value="El Anillo" checked> 
  				Jamón-----<input type="checkbox" name="VisitanteCheck" value="Jamón">
  				Diplomacia<input type="checkbox" name="VisitanteCheck" value="Diplomacia" >
  				Cerveza---<input type="checkbox" name="VisitanteCheck" value="Cerveza" > <br>
  				
			<button type="submit">Guardar y/o Modificar</button>
		</form>
</body>
</html>