package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	
	@Id
	int faculty_id;
	int department_id;
	String email;
	String name;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int faculty_id, int department_id, String email, String name) {
		super();
		this.faculty_id = faculty_id;
		this.department_id = department_id;
		this.email = email;
		this.name = name;
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Faculty [faculty_id=" + faculty_id + ", department_id=" + department_id + ", email=" + email + ", name="
				+ name + "]";
	}
	
	

}
