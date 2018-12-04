package com.utn.jpy.ejemploAnotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.utn.beans.AppConfig;
import com.utn.beans.HolaMundo;

public class Test {
	
	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HolaMundo hm = (HolaMundo) appContext.getBean("holaMundo");
	
		System.out.println(hm.getSaludo());
		
		((ConfigurableApplicationContext)appContext).close();

	
	}

}
