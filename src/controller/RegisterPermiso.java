package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import model.Permiso;

import model.PMF;

public class RegisterPermiso extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		String guerrero=request.getParameter("Guerrero");
		String[] guerreroRecurso=request.getParameterValues("GuerreroCheck");
		ArrayList<Integer> Permiso=new ArrayList<Integer>();
		
		if(guerreroRecurso!=null&&guerreroRecurso.length>0){
			System.out.println(guerrero);
			for(int i=0;i<guerreroRecurso.length;i++){
				System.out.println(guerreroRecurso[i]);
			}	
		}
		Permiso permiso=new Permiso();
		
		try {
			pm.makePersistent(permiso);
		} finally {
			pm.close();
		}
		response.sendRedirect("VerUsuarios.jsp");
		
		String mago=request.getParameter("Mago");
		String[] magoPermisos=request.getParameterValues("MagoCheck");
		
		String hobbit=request.getParameter("Hobbit");
		String[] hobbitPermisos=request.getParameterValues("HobbitCheck");
		
		String visitante=request.getParameter("Visitante");
		String[] visitantePermisos=request.getParameterValues("VisitanteCheck");
		
	}
}
