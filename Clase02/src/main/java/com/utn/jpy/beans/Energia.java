package com.utn.jpy.beans;

public class Energia {
	
	private int cantidad;
	private int maximaCan;
	private boolean superPoder;
	

	public Energia (){
		
	}
	
	
	public Energia(int cantidad, int maximaCan, boolean superPoder) {
		this.cantidad = cantidad;
		this.maximaCan = maximaCan;
		this.superPoder = superPoder;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getMaximaCan() {
		return maximaCan;
	}
	public void setMaximaCan(int maximaCan) {
		this.maximaCan = maximaCan;
	}
	public boolean isSuperPoder() {
		return superPoder;
	}
	public void setSuperPoder(boolean superPoder) {
		this.superPoder = superPoder;
	}
	
	

}
