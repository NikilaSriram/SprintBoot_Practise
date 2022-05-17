package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Practise1_AutowireDependencyInjection {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = SpringApplication.run(Practise1_AutowireDependencyInjection.class, args);
		
		//Eventhough we create two emp objects, only one object gets created as spring follows singleton scope
		//change scope to prototype if we need to get as many objects as created
		Employee emp = context.getBean(Employee.class);
		Employee emp1 = context.getBean(Employee.class);
		
		//throws error without component annotation
		//throws null exception without autowire annotation
		emp.show(); 
		//emp1.show();
		
		
		
	}

}
