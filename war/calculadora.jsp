<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Calculadora</title>
		<link rel="icon" type="image/png" href="http://indice-ejemplos.appspot.com/Java-icon.png"> 
		<link rel="stylesheet" type="text/css" href="http://indice-ejemplos.appspot.com/miestilo.css">
	</head>
	<body>
		<form name="calculadora" method="get" action="/calculadora">
			<fieldset><legend>Calculadora</legend>
				<div id="calculadora">
					<div class="fila">
						<div class="etiqueta"><label for="oper1">Primer operador:</label></div>
						<div class="control"><input name="oper1" value="20"/></div>
					</div>
					<div class="fila">
						<div class="etiqueta"><label for="oper2">Segundo operador:</label></div>
						<div class="control"><input name="oper2" value="4"/></div>
					</div>
					<div class="fila">
						<div class="etiqueta"><label for="opera">Operación:</label></div>
						<div class="control">
							<select name="opera" size="6">
				  			<option value="suma" selected="1">Suma</option>
				  			<option value="resta">Resta</option>
				  			<option value="producto">Producto</option>
				  			<option value="division">Division</option>
							</select>
						</div>
					</div>
					<div class="fila">
						<div id="action"><input type="reset" value="Limpiar"/><input type="submit" value="Operar"/></div>
					</div>
				</div>
			</fieldset>
		</form>
		</p>
	</body>
</html>