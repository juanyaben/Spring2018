package com.utn.jpy.JDBCspringXML;

import java.util.List;

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
		
		System.out.println("Nombre de la persona ID = 4 : " +personaService.getNombrePersona(4) +"\n");
		
		Persona p1=null;
		try {
			p1 = personaService.buscarPersona(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Persona p1:  " +p1.getNombre() +"   " +p1.getId() +"\n");
		
		List<Persona> listaPersonas = null;
		
		try {
			listaPersonas = personaService.buscarPersonas();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (Persona p : listaPersonas) {
			System.out.println("Persona p:  " +p.getNombre() +"   " +p.getId());
		}
		
		
		
	}
}
