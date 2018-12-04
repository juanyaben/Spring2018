package com.utn.jpy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.utn.jpy.interfaces.IArma;

public class Jugador {
	
	private String nombre;
	@Autowired	// Por defecto utiliza byType. Si hay mas de un tipo igual elije por Name, si no podemos usar name usamos:
	@Qualifier("armaInicial")	//Si hay mas de un bean posible, elijo uno con /qualifier
	private IArma arma;
	private Energia energia;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IArma getArma() {
		return arma;
	}
	public void setArma(IArma arma) {
		this.arma = arma;
	}
	public Energia getEnergia() {
		return energia;
	}
	@Required
	public void setEnergia(Energia energia) {
		this.energia = energia;
	}
	
	

}
