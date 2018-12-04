package com.utn.jpy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.utn.jpy.interfaces.IArma;

@Component
public class Jugador {
	
	@Value("Player")
	private String nombre;
	@Autowired	// Por defecto utiliza byType. Si hay mas de un tipo igual elije por Name, si no podemos usar name usamos:
	@Qualifier("cuchillo")	//Si hay mas de un bean posible, elijo uno con Qualifier
	private IArma arma;
	@Autowired
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

	
	public void setEnergia(Energia energia) {
		this.energia = energia;
	}
	
	

}
