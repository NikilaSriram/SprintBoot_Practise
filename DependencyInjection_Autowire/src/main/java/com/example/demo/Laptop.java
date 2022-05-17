package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int empid;
	private String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void compile()
	{
		System.out.println("InLaptopCompile");
	}
	
}
