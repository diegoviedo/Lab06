package web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class Iniciar extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/HTML");
		String nombre=req.getParameter("cuenta");
		String clave=req.getParameter("clave");
		
		if(nombre.equalsIgnoreCase("pepe")&&
			clave.equalsIgnoreCase("pepe")){

			HttpSession misesion= req.getSession(true);
			misesion.setAttribute("nombre","pepe");
			misesion.setAttribute("contraseña","pepe");
			misesion.setMaxInactiveInterval(60);// 10 segundos
			//Date date = new Date();
			//misesion.setAttribute("inicio", date.toString());
			
			resp.getWriter().println("Se ha iniciado una sesion con los siguientes datos:");
			resp.getWriter().println("<BR>ID : " + misesion.getId());
			resp.getWriter().println("<BR>CreationTime : " + misesion.getCreationTime());
			//resp.getWriter().println("MaxInactiveInterval : " + misesion.getMaxInactiveInterval());
			//resp.getWriter().println("-------------------------------------------------------------");
			resp.getWriter().println("<BR>Nombre : " + misesion.getAttribute("nombre"));
			resp.getWriter().println("<BR>Contraseña : " + misesion.getAttribute("contraseña"));
			//resp.getWriter().println("<BR>Inicio : " + misesion.getAttribute("inicio"));
			resp.getWriter().println("<BR><a href='calculadora.jsp'>USA LA CALCULADORA</a>");
		}else{
			resp.sendRedirect("NoIngreso.jsp");
			
			
		}
		
	}
}
