package com.utn.jpy.JDBCspringXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.jpy.beans.Persona;
import com.utn.jpy.service.PersonaService;

public class App {

	
	public static void main(String[] args) {
		
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/jpy/xml/beans.xml");
		
		PersonaService personaService = (PersonaService) appContext.getBean("personaServiceImpl");
		
		Persona persona = null;
		
		try {
			persona = personaService.buscar(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(persona.getNombre() +"\n");
		
		System.out.println("Cantidad de personas: ");
		
		System.out.println(personaService.cantidadDePersonas());
		
		
	}
}
