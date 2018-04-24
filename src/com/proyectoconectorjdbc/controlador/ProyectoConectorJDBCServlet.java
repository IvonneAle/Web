package com.proyectoconectorjdbc.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectoconectorjdbc.modelo.ProyectoConectorJDBCModelo;



/**
 * Servlet implementation class ProyectoConectorJDBCServlet
 */
@WebServlet("/ProyectoConectorJDBCServlet")
public class ProyectoConectorJDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProyectoConectorJDBCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProyectoConectorJDBCModelo Alex = new ProyectoConectorJDBCModelo();
		String url = "jdbc:mysql://127.0.0.1:3306/biblioteca";
		String user = "root";
		String password = "password";
		
		//Alex.setidautor(Integer.parseInt(request.getParameter("txtidautor")));
		
		//response.getWriter().append("el id es: "+Alex.getidautor());
		
		
		
		Alex.setidautor(Integer.parseInt(request.getParameter("txtidautor")));
		Alex.setnombre(request.getParameter("txtnombre"));
		Alex.setapellido(request.getParameter("txtapellido"));
		Alex.setdomicilio(request.getParameter("txtdomicilio"));
		Alex.setsalario(Double.parseDouble(request.getParameter("txtsalario")));
		
		response.getWriter().append("El id del autor:"+Alex.getidautor()+"<br/>"+"Nombre:"+Alex.getnombre()+"<br/>"+"Apellido:"+Alex.getapellido()+"<br/>"+"Domicilio:"+Alex.getdomicilio()+"<br/>"+"Sueldo:"+Alex.getsalario());
		
		
		
		try {
			//load the Conector/J driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Establish conection to MySql
			Connection conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println("Conexión exitosa");
			
			Statement stmnt = (Statement) conn.createStatement();
			
			ResultSet rs = stmnt.executeQuery("SELECT * FROM autores");
			
			while(rs.next())
			{
				System.out.println("Id Autor: "+rs.getInt("idautor"));
			}
			conn.close();
		}catch(Exception e) 
		{System.out.println("Exception: "+e);}
		}
		
		
		
		
	}


