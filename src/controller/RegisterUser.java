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

import model.Usuario;
import javax.jdo.PersistenceManager;
import model.PMF;

public class RegisterUser extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Usuario usuario=new Usuario(
				request.getParameter("name"),
				request.getParameter("gmail"),
				request.getParameter("tipo")
				);
		try {
			pm.makePersistent(usuario);
		} finally {
			pm.close();
		}
		response.sendRedirect("VerUsuarios.jsp");
		
	}
}