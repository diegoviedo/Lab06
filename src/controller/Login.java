package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession misesion= request.getSession();
		UserService us = UserServiceFactory.getUserService();
		User user = us.getCurrentUser();
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		if(user == null){
			response.sendRedirect(us.createLoginURL(request.getRequestURI()));
	 	}else{
		user.getNickname();
		/**
		user.getAuthDomain();
		user.getEmail();
		user.getUserId();
		user.getFederatedIdentity();
		
		us.isUserAdmin();
		us.isUserLoggedIn();
		us.getCurrentUser();**/
		//Cerrar Sesión
		//<a href="us.createLogoutURL(req.getRequestURI())"> Cerrar sesión </a>
		//Probando Salida de datos
		misesion.setAttribute("gmail",user.getEmail());
		System.out.println(user.getNickname());
		
		//Poner true administrador ?????
		//Probando opciones de google la casilla
		System.out.println(us.isUserAdmin());
		
		
		out.println("<a href='"+ us.createLogoutURL(request.getRequestURI())+"'> Cerrar sesión </a>");
	
			if(user.getNickname().equals("test@example.com")&&us.isUserAdmin()==true){
				System.out.println("Entrando validando Datos = "+user.getEmail());
				request.setAttribute("gmail", (String)misesion.getAttribute("gmail"));
				RequestDispatcher dispatcher =request.getRequestDispatcher("/administrador.jsp");
				dispatcher.forward(request, response);
			}
			else{
				out.println("Ususario no permitido");
				out.println("<a href='"+ us.createLogoutURL(request.getRequestURI())+"'> Atrás </a>");
			}
		
	 	}
		
	}
}