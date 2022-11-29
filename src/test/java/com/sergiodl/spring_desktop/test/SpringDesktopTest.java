package com.sergiodl.spring_desktop.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Pruebas de spring
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		assertNotNull(context);
		
		System.out.println("Contexto cargado exitosamente!!!");
	}

}
