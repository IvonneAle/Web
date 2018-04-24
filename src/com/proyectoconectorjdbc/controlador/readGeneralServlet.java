package com.proyectoconectorjdbc.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class readGeneralServlet
 */
@WebServlet("/readGeneralServlet")
public class readGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readGeneralServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append(" Estamos en read GeneralServlet ").append(request.getContextPath());
		
		String url = "jdbc:mysql://127.0.0.1:3306/biblioteca";
		String user = "root";
		String password = "password";
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn=(Connection)DriverManager.getConnection(url,user,password);
			System.out.println("Conexion exitosa");
			conn.close();
		}catch(Exception e) 
		{System.out.println("Exception: "+e);}
	}

}
