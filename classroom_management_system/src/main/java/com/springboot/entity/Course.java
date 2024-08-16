package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	int course_id;
	String name;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int course_id, String name) {
		super();
		this.course_id = course_id;
		this.name = name;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", name=" + name + "]";
	}
	
	
	
	

}
