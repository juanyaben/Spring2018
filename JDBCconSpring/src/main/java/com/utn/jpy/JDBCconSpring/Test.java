package com.utn.jpy.JDBCconSpring;

import com.utn.beans.Persona;
import com.utn.dao.JdbcDaoImpl;

public class Test {
	
	

	public static void main(String[] args) {

		Persona persona;

		JdbcDaoImpl jdb = new JdbcDaoImpl();
	
		persona = jdb.getPersona(3);
		
		System.out.println(persona.getNombre());
		
	}

}
