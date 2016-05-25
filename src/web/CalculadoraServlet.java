package web;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CalculadoraServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println(operar(req.getParameter("oper1"),req.getParameter("oper2"),req.getParameter("opera")));
	}
	
	public String operar(String a, String b, String op){
		
		if( isNumeric(a) && isNumeric(b) ){
			switch(op){
			case "resta":
				return op+" = "+String.valueOf(Double.parseDouble(a)-Double.parseDouble(b)); 
			case "producto":
				return op+" = "+String.valueOf(Double.parseDouble(a)*Double.parseDouble(b));
			case "division":
				if(Double.parseDouble(b)==Double.parseDouble("0.0"))
					return "error";
				else
					return op+" = "+String.valueOf(Double.parseDouble(a)/Double.parseDouble(b));
			default:
				return op+" = "+String.valueOf(Double.parseDouble(a)+Double.parseDouble(b));				
			}
		}
		return "error";
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
}

