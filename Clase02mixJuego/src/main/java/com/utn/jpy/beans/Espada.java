package com.utn.jpy.beans;

import org.springframework.stereotype.Component;

import com.utn.jpy.interfaces.IArma;


@Component
public class Espada implements IArma{

	public String atacar() {
		return "Ataco con la Espada !!! ";
	}
	
	

}
