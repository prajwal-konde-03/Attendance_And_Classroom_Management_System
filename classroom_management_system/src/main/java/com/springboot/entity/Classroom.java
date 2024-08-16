package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classroom {
	
	@Id
	int classroom_id;
	String name;
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classroom(int classroom_id, String name) {
		super();
		this.classroom_id = classroom_id;
		this.name = name;
	}
	public int getClassroom_id() {
		return classroom_id;
	}
	public void setClassroom_id(int classroom_id) {
		this.classroom_id = classroom_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Classroom [classroom_id=" + classroom_id + ", name=" + name + "]";
	}
	
	
	

}
