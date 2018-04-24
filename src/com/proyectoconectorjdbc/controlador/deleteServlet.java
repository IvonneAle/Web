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

/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// para cada cuadro de texto es recomendable probar con su append.
		//Declaro las variables que corresponden a las cajas de texto 
		String idautor;
		//Me traigo los valores del objeto request y los guardo en las variables recién declaradas
		idautor= request.getParameter("txtIdAutor");
		//Compruebo que las variables String realmente obtuvieron (cacharon) los valores del objeto request mediante una salida al objeto response.
		response.getWriter().append("Id Autor"+idautor);
		
		//Declaro las variables necesarias que contendrán los valores para crear la conexión a la base de datos.
		String url;
		String user;
		String pass;
		String SentenciaSQL;
		
		//Tengo una dirección del servidor de base de satos y el puerto y el nombre de base de datos. así construiré mi link.la pagina "Conection streams ayuda.
		url="jdbc:mysql://127.0.0.1:3306/biblioteca";
		//Asigno los valores iniciales a dichas variables.
		user="root";
		pass="password";
		SentenciaSQL="SELECT * FROM autores WHERE idautor="+idautor;
	
			
			//Crear la conexión a la base de datos
			try
			{
				//Instanciamos el API del connector sin nombre y solo va a sobrevivir en las llaves del try. no tiene nombre el objeto.
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				//Declaramos el objeto de tipo Connection que nos permitirá abrir la conexión
				Connection conn;
				
				//Declaramos el objeto Statement que nos permite ejecutar sentencias SQL sobre la base de datos
				Statement stmnt;
				
				//Declaramos el objeto ResultSet que nos permite guardar los datos obtenidos por las sentencias sql ejecutadas en la base de datos
				ResultSet rs;
				
				//Abrimos la conexión a la base de datos
				conn = (Connection) DriverManager.getConnection(url, user, pass);
				
				//Creamos la instancia de la sentencia sql que apunte al objeto connection
				stmnt = (Statement) conn.createStatement();
				
				//Ejecuto la sentencis SQL almacenada en la variable String
				rs = stmnt.executeQuery(SentenciaSQL);
				
				//Recorremos el ResultSet para obtener la información que se trajo de la base de datos
				while(rs.next())
				{
					response.getWriter().append("<form action=\"borrarAutorServlet\" method=\"post\">");
					//response.getWriter().append("Id Autor:"+rs.getInt("idautor")+"<br/>");
					
					response.getWriter().append("Id Autor:"+"<label id=\"lblIdAutor\" name=\"lblIdAutor\">"+rs.getInt("idautor")+"</label>");
					
					response.getWriter().append("Nombre Autor:"+rs.getString("nombre")+"<br/>");
					response.getWriter().append("Apellido Autor:"+rs.getString("apellido")+"<br/>");
					response.getWriter().append("Teléfono Autor:"+rs.getInt("telefono")+"<br/>");
					response.getWriter().append("Domicilio Autor:"+rs.getString("domicilio")+"<br/>");
					//response.getWriter().append("Salario Autor:"+rs.getDouble("Salario")+"<br/>");
					response.getWriter().append("<p><input type=\"submit\" value=\"Borrar Usuario\"</p>");
					response.getWriter().append("</form>");
					
				}
				
				//Cerramos todos los objetos
				rs.close();
				stmnt.close();
				conn.close();
			}
			catch(Exception tacos)
			{
				System.out.println("Error en la conexión:"+tacos);
			}
			
		}
		
	

}
