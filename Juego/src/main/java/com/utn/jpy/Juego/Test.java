package com.utn.jpy.Juego;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.beans.Jugador;



public class Test {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/utn/xml/beans.xml");

		Jugador jugador = (Jugador) appContext.getBean("ogro");
		
		
		System.out.println("Nombre jugador: " +jugador.getNombre() + "    Ataque: " +jugador.getArma().atacar());

		
		jugador = (Jugador) appContext.getBean("caballero");
		
		
		System.out.println("Nombre jugador: " +jugador.getNombre() + "    Ataque: " +jugador.getArma().atacar() +"\n");

		System.out.println("Energia: " +jugador.getEnergia().getCantidad() + "\n"
						+  "Energia Maxima: " +jugador.getEnergia().getMaximo() + "\n"
						+  "Invensible: " +jugador.getEnergia().isInvensible());

		
		
		((ConfigurableApplicationContext)appContext).close();

		
		
		
	}

}
