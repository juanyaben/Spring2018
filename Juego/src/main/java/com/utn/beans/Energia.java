package com.utn.beans;

public class Energia {
	
	private int cantidad;
	
	private int maximo;
	
	private boolean invensible;
	

	public Energia(int cantidad, int maximo, boolean invensible) {
		super();
		this.cantidad = cantidad;
		this.maximo = maximo;
		this.invensible = invensible;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public boolean isInvensible() {
		return invensible;
	}

	public void setInvensible(boolean invensible) {
		this.invensible = invensible;
	}

	public Energia(int cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
