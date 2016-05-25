package web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;


@SuppressWarnings("serial")
public class Iniciar extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		resp.setContentType("text/plain");
		
		
		HttpSession misesion= req.getSession(true);
		misesion.setAttribute("nombre","pepe");
		misesion.setAttribute("contraseña","pepe");
		//misesion.setMaxInactiveInterval(10);// 10 segundos
		Date date = new Date();
		misesion.setAttribute("inicio", date.toString());
		
		resp.getWriter().println("Se ha iniciado una sesion con los siguientes datos:");
		resp.getWriter().println("ID : " + misesion.getId());
		resp.getWriter().println("CreationTime : " + misesion.getCreationTime());
		resp.getWriter().println("MaxInactiveInterval : " + misesion.getMaxInactiveInterval());
		resp.getWriter().println("-------------------------------------------------------------");
		resp.getWriter().println("Nombre : " + misesion.getAttribute("nombre"));
		resp.getWriter().println("Email : " + misesion.getAttribute("email"));
		resp.getWriter().println("Inicio : " + misesion.getAttribute("inicio"));
		
	}
}
