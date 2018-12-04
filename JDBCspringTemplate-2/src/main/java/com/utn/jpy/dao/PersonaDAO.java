package com.utn.jpy.dao;

import java.util.List;

import com.utn.jpy.beans.Persona;

public interface PersonaDAO {
	
	public Persona buscar(int idPersona) throws Exception;
	
	public int cantidadDePersonas ();
	
	public String getNombrePersona(int idPersona);
	
	public Persona buscarPersona(int idPersona) throws Exception;
	
	public List<Persona> buscarPersonas() throws Exception;
	

}
