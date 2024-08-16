package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	int department_id;
	String name;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int department_id, String name) {
		super();
		this.department_id = department_id;
		this.name = name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", name=" + name + "]";
	}
	
	

}
