<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cafeteria EXPRESSO</title>
<script src="http://code.jquery.com/jquery-latest.js">
	
</script>
<script>
	$(document).ready(function() {
		$('#submit').click(function(event) {
			var nombreVar = $('#usuario').val();
			var apellidoVar = $('#pedido').val();
			$.post('actionServlet', {
				nombre : nombreVar,
				apellido: apellidoVar,
			}, function(responseText) {
				$('#pedidos').html(responseText);
			});
		});
	});
</script>
</head>
<body>
	<h1>Cafeteria EXPRESSO</h1>
	<h2>Pedidos </h2>
	<div id="pedidos"></div>
	
	<form id="form1">
		Usuario: <input type="text" id="usuario" /> <br>
		Pedido : <input type="text" id="pedido" /> <br>
		
		<input type="button" id="submit" value="Añadir" /> 
	</form>
	<br>
	
</body>
</html>