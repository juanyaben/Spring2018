package com.utn.jpy.service;

import com.utn.jpy.beans.Persona;

public interface PersonaService {
	
	public Persona buscar(int idPersona) throws Exception;
	
	public int cantidadDePersonas ();

}
