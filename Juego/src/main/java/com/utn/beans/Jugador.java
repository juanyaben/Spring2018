package com.utn.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.utn.interfaces.IArma;

public class Jugador {
	
	
	private String nombre;
	@Autowired
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
	public void setEnergia(Energia energia) {
		this.energia = energia;
	}
	

}
