package pw2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<Pedido> pedidos = new ArrayList<>();

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		response.setContentType( "text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();
		
		
		String usuario = request.getParameter("usuario");
		String pedido = request.getParameter("pedido");
		
		
		if (!usuario.equals("") && !pedido.equals("") ) {
			
			Pedido pedidoX = new Pedido(usuario,pedido);
			pedidos.add(pedidoX);
		}
		
		out.println("<ul>");
		for(int i=0; i<pedidos.size(); i++){
			Pedido pedidoA = pedidos.get(i);
			
			out.println("<li>Usuario: "+pedidoA.getUsuario()+"--->Pedido:"+pedidoA.getPedido()+"</li>");
			
		}
		out.println("</ul>");
	}

}
