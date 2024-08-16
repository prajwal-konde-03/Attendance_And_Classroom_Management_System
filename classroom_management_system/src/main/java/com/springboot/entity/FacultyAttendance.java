package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FacultyAttendance {
	
	@Id
	int facultyattendance_id;
	
	@ManyToOne
	@JoinColumn(name="faculty_id")
	Faculty faculty;
	
	@ManyToOne
	@JoinColumn(name = "classschedule_id")
	ClassSchedule classSchedule;
	
	String date;
	String status;
	
	public FacultyAttendance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FacultyAttendance(int facultyattendance_id, Faculty faculty, ClassSchedule classSchedule, String date,
			String status) {
		super();
		this.facultyattendance_id = facultyattendance_id;
		this.faculty = faculty;
		this.classSchedule = classSchedule;
		this.date = date;
		this.status = status;
	}

	public int getFacultyattendance_id() {
		return facultyattendance_id;
	}

	public void setFacultyattendance_id(int facultyattendance_id) {
		this.facultyattendance_id = facultyattendance_id;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public ClassSchedule getClassSchedule() {
		return classSchedule;
	}

	public void setClassSchedule(ClassSchedule classSchedule) {
		this.classSchedule = classSchedule;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FacultyAttendance [facultyattendance_id=" + facultyattendance_id + ", faculty=" + faculty
				+ ", classSchedule=" + classSchedule + ", date=" + date + ", status=" + status + "]";
	}
	
	
	
	

}

