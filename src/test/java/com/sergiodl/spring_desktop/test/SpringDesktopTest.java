package com.sergiodl.spring_desktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sergiodl.spring_desktop.dao.DisqueraDao;


//Pruebas de spring
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		assertNotNull(context);
		
		DisqueraDao disqueraDao = (DisqueraDao) context.getBean("disqueraDaoBean");
		
		DisqueraDao disqueraDaoDos = (DisqueraDao) context.getBean("disqueraDaoBean");
		
		assertNotNull(disqueraDao);
		

		System.out.println("Identificador de disqueraDao "+disqueraDao);
		System.out.println("Identificador de disqueraDaoDos "+disqueraDaoDos);
				
		Properties properties = (Properties)context.getBean("properties");
		System.out.println("propertie "+properties.get("spring-username"));
		
		System.out.println("Contexto cargado exitosamente");
		
	}

}
