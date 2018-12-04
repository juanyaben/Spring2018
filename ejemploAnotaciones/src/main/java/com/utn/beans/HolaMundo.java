package com.utn.beans;

import org.springframework.beans.factory.annotation.Value;

public class HolaMundo {
	
	@Value("Hola Mundo desde Spring con Anotaciones !!")
	String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
	

}
