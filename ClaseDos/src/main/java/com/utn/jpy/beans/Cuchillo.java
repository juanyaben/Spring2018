package com.utn.jpy.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.utn.jpy.interfaces.IArma;

@Component("armaInicial")
public class Cuchillo implements IArma {

	
	public String atacar() {
		return "Ataco con el cuchillo zasssss !!!";
	}

}
