package com.utn.jpy.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Energia {
	
	@Value("100")
	private int cantidad;
	@Value("100")
	private int cantMaxima;
	@Value("false")
	private boolean superpoder;
	
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCantMaxima() {
		return cantMaxima;
	}
	public void setCantMaxima(int cantMaxima) {
		this.cantMaxima = cantMaxima;
	}
	public boolean isSuperpoder() {
		return superpoder;
	}
	public void setSuperpoder(boolean superpoder) {
		this.superpoder = superpoder;
	}
	
	

}
