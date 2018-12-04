package com.utn.jpy.ClaseDos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import com.utn.jpy.beans.Jugador;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appContex = new ClassPathXmlApplicationContext("com/utn/xml/bean.xml");
		
		Jugador jugador = (Jugador) appContex.getBean("jugador");
		
		System.out.println("EL nombre del Jugador es: " +jugador.getNombre() +"\n"
						+  "Energia: " +jugador.getEnergia().getCantidad() + "\n"
						+  "Arma: "  +jugador.getArma().atacar() +"\n");
		
		
		

	}

}
