package com.utn.jpy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utn.jpy.beans.Persona;
import com.utn.jpy.dao.PersonaDAO;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaDAO personaDao;

	
	@Override
	public Persona buscar(int idPersona) throws Exception {
	
		Persona persona;
		persona = personaDao.buscar(idPersona);
		return persona;
	}


	@Override
	public int cantidadDePersonas() {
		return personaDao.cantidadDePersonas();
	}
	
	@Override
	public String getNombrePersona(int idPersona){
		return personaDao.getNombrePersona(idPersona);
	}


	@Override
	public Persona buscarPersona(int idPersona) throws Exception {
		return personaDao.buscarPersona(idPersona);
	}


	@Override
	public List<Persona> buscarPersonas() throws Exception {
		return personaDao.buscarPersonas();
	}

	
}
