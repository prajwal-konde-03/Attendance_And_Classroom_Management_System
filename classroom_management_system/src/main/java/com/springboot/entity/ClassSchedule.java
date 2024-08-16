package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassSchedule {
	
	@Id
	int classschedule_id;
	int classroom_id;
	String day_of_week;
	String end_time;
	String start_time;
	int subject_id;
	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassSchedule(int classschedule_id, int classroom_id, String day_of_week, String end_time, String start_time,
			int subject_id) {
		super();
		this.classschedule_id = classschedule_id;
		this.classroom_id = classroom_id;
		this.day_of_week = day_of_week;
		this.end_time = end_time;
		this.start_time = start_time;
		this.subject_id = subject_id;
	}
	public int getClassschedule_id() {
		return classschedule_id;
	}
	public void setClassschedule_id(int classschedule_id) {
		this.classschedule_id = classschedule_id;
	}
	public int getClassroom_id() {
		return classroom_id;
	}
	public void setClassroom_id(int classroom_id) {
		this.classroom_id = classroom_id;
	}
	public String getDay_of_week() {
		return day_of_week;
	}
	public void setDay_of_week(String day_of_week) {
		this.day_of_week = day_of_week;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	@Override
	public String toString() {
		return "ClassSchedule [classschedule_id=" + classschedule_id + ", classroom_id=" + classroom_id
				+ ", day_of_week=" + day_of_week + ", end_time=" + end_time + ", start_time=" + start_time
				+ ", subject_id=" + subject_id + "]";
	}

	
	
	

}
