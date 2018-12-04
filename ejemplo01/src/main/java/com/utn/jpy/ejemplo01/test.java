package com.utn.jpy.ejemplo01;

import org.springframework.aop.target.SimpleBeanTargetSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.beans.HolaMundo;
import com.utn.beans.Persona;

public class test {

	public static void main(String[] args) {
		
		// Antes
		// HolaMondo hm = new HolaMundo();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/xml/beans.xml");
		HolaMundo hm = (HolaMundo) appContext.getBean("holaMundo");
		
		System.out.println(hm.getSaludo());
		
		
		Persona persona = (Persona) appContext.getBean("persona");
		Persona persona2 = (Persona) appContext.getBean("persona");
		
		System.out.println(persona);
		System.out.println(persona2);
		
		System.out.println(persona.getId() +"  " +persona.getNombre() +"  "  +persona.getApodo() +"\n");
		
		System.out.println("Pais: " +persona.getPais().getNombre() +"   Ciudad: " +persona.getPais().getCiudad().getNombre());
		

		((ConfigurableApplicationContext)appContext).close();

	}

}
