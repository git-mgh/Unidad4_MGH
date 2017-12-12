package com.lds;

import java.io.IOException;
import java.security.KeyStore.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(request, response);
//		String contenido = System.getProperties().toString();
//		String contenido = "Lunes,Martes,Miercoles";
//	    String contenidoArray[] = contenido.split(",");
//	    for(String contenido2 : contenidoArray){
//	    	response.getWriter().append(contenido2);
//	        }
//        contenido = "";
//	    for(String contenido2 : contenidoArray){
//	    	contenido = contenido + contenido2 + "<br>";
//        }
//	    System.out.println(contenido);
//    	response.getWriter().append(contenido);
//    	response.getWriter().append(System.getProperties().toString());
//	    response.getWriter().System.out.println(contenido);
		
		String contenido = "";
		for( java.util.Map.Entry<Object, Object> entry : System.getProperties().entrySet()){
			contenido = contenido + entry.getKey() + " = " + entry.getValue();
			contenido = contenido + "<br>";
		}
		response.getWriter().append(contenido);
	}
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
//	}

}
