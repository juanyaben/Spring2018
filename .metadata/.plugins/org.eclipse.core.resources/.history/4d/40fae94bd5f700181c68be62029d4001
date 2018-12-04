package com.utn.jpy.Clase01;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.utn.jpy.beans.Cuchillo;
import com.utn.jpy.beans.Espada;
import com.utn.jpy.beans.Jugador;
import com.utn.jpy.interfaces.IArma;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		System.out.println("Juego \n");
		
		Jugador jugador = (Jugador) appContext.getBean("jugador");
		
		System.out.println("Nombre Jugador: " +jugador.getNombre() +"\n"
				+  "Arma: " +jugador.getArma().atacar() +"\n"
				+  "Energia: " +jugador.getEnergia().getCantidad() +"\n"
				+  "Superpoder: " +jugador.getEnergia().isSuperPoder() +"\n");

		
		System.out.println("Elija un Arma: 1- Cuchillo , 2- Espada , otro- punio");
		opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			jugador.setArma((IArma)appContext.getBean(Cuchillo.class));
			break;
		
		case 2:
			jugador.setArma((IArma)appContext.getBean(Espada.class));			
			break;

			
		default:
			break;
		}
		
		
		System.out.println("Nombre Jugador (2): " +jugador.getNombre() +"\n"
				+  "Arma: " +jugador.getArma().atacar() +"\n"
				+  "Energia: " +jugador.getEnergia().getCantidad() +"\n"
				+  "Superpoder: " +jugador.getEnergia().isSuperPoder() +"\n");


		
		((ConfigurableApplicationContext)appContext).close();
		
	}

}
