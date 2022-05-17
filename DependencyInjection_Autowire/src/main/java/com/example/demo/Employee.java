package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Tells spring to create and give object of particular type 
@Scope("prototype") //Creates object every time getbean() is called
public class Employee {
	private int id;
	private String name;
	//By default, Laptop object is created with name laptop
	@Autowired // Tells spring to search laptop object by type and connect employee,laptop classes
	@Qualifier("lap1") //Search Laptop object by name
	private Laptop laptop;
	
	
	public Employee() {
		super();
		System.out.println("object created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("In show");	
		laptop.compile();
	}

}
