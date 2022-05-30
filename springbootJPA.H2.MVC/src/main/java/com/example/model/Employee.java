package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //specifies that the class is an entity and is mapped to a database table
public class Employee {
 
	@Id // indicating the member field below is the primary key of the current entity
	private int id;
	private String name; 
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
