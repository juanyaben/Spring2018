package com.utn.jpy.Clase01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.jpy.beans.HolaMundo;
import com.utn.jpy.beans.Jugador;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/xml/beans.xml");
		HolaMundo hm = (HolaMundo) appContext.getBean("holaMundo");
		
		System.out.println(hm.getSaludo() +"\n");
		
		Jugador jugador = (Jugador) appContext.getBean(Jugador.class);
		
		System.out.println("Nombre Jugador (1): " +jugador.getNombre() +"\n"
						+  "Arma: " +jugador.getArma().getNombre() +"\n"
						+  "Energia: " +jugador.getEnergia().getCantidad() +"\n"
						+  "Superpoder: " +jugador.getEnergia().isSuperPoder() +"\n");
		
		
		Jugador jugador2 = (Jugador) appContext.getBean("jugador");
		
		jugador2.setNombre("Juan");
		
		
		System.out.println("Nombre Jugador (2): " +jugador2.getNombre() +"\n"
						+  "Arma: " +jugador2.getArma().getNombre() +"\n"
						+  "Energia: " +jugador2.getEnergia().getCantidad() +"\n"
						+  "Superpoder: " +jugador2.getEnergia().isSuperPoder() +"\n");
		

		System.out.println("Nombre Jugador (1): " +jugador.getNombre() +"\n"
				+  "Arma: " +jugador.getArma().getNombre() +"\n"
				+  "Energia: " +jugador.getEnergia().getCantidad() +"\n"
				+  "Superpoder: " +jugador.getEnergia().isSuperPoder() +"\n");

		
		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
