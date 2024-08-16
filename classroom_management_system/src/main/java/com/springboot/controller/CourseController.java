package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Course;
import com.springboot.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@PostMapping("/insert")
	public String insertIntoCourse(@RequestBody Course course) {
		return service.insertIntoCourse(course);
	}
	
	@GetMapping("/all")
	public List<Course > getAllCourses(){
		return service.getAllCourses();
	}
	
	@GetMapping("/byid/{id}")
	public Course getCourseById(@PathVariable int id) {
		return service.getCourseById(id);
	}
	
	@PutMapping("/update")
	public String updateCourse(@RequestBody Course course) {
		return service.updateCourse(course);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable int id) {
		return service.deleteCourse(id);
	}
}
