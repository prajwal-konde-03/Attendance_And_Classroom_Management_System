package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	int subject_id;
	String name;
	String description;
	int department_id;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int subject_id, String name, String description, int department_id) {
		super();
		this.subject_id = subject_id;
		this.name = name;
		this.description = description;
		this.department_id = department_id;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "Subject [subject_id=" + subject_id + ", name=" + name + ", description=" + description
				+ ", department_id=" + department_id + "]";
	}
	
	}
	
