package com.utn.jpy.Clase01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.jpy.beans.Persona;
import com.utn.jpy.dao.JdbcDaoImpl;



public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/xml/beans.xml");
		

		Persona persona;

		JdbcDaoImpl jdb = new JdbcDaoImpl();
	
		persona = jdb.getPersona(3);
		
		System.out.println(persona.getNombre());

		
//		((ConfigurableApplicationContext)appContext).close();
		
	}

}
