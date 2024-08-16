package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.CourseDAO;
import com.springboot.entity.Course;

@Service
public class CourseService {
	
	
	@Autowired
	CourseDAO dao;
	
	public String insertIntoCourse(Course course) {
		return dao.insertIntoCourse(course);
	}
	
	public List<Course> getAllCourses(){
		return dao.getAllCourses();
	}

	public Course getCourseById(int id) {
		return dao.getCurseById(id);
	}

	public String updateCourse(Course course) {
		return dao.updateCourse(course);
	}
	
	
	public String deleteCourse(int id) {
		return dao.deleteCourse(id);
	}

}
