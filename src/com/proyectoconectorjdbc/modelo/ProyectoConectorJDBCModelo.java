package com.proyectoconectorjdbc.modelo;

public class ProyectoConectorJDBCModelo {

	private int idautor;
	private String nombre;
	private String apellido;
	private String domicilio;
	private double salario;
	
	public void setidautor(int autor) 
	{
		idautor = autor;
	}
	
	public int getidautor() 
	{
		return idautor;
	}
	
	public void setnombre(String nomb) 
	{
		nombre = nomb;
	}
	
	public String getnombre() 
	{
		return nombre;
	}
	
	public void setapellido(String apell) 
	{
		apellido = apell;
	}
	
	public String getapellido() 
	{
		return apellido;
	}
	
	public void setdomicilio(String domi) 
	{
		domicilio = domi;
	}
	
	public String getdomicilio() 
	{
		return domicilio;
	}
	
	public void setsalario(double salari) 
	{
		salario = salari;
	}
	
	public double getsalario() 
	{
		return salario;
	}
}
