package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.FacultyAttendance;
import com.springboot.service.FacultyAttendanceService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/api/facultyattendance")
public class FacultyAttendanceController{

	@Autowired
	FacultyAttendanceService attendanceservice;
	
	@PostMapping("/insert")
	public String insertIntoFacultyAttendance(@RequestBody FacultyAttendance attendance) {
		return attendanceservice.insertIntoFacultyAttendance(attendance);
	}
	
	@GetMapping("/allfacultyattendance")
	public List<FacultyAttendance> getAllFacultyAttendance(){
		return attendanceservice.getAllFacultyAttendance();
	}
	
	@GetMapping("/allfacultyattendancebyid/{id}")
	public FacultyAttendance getAllFacultyAttendanceById(@PathVariable int id) {
		return attendanceservice.getAllFacultyAttendanceById(id);
		
	}
	
	@PutMapping("/update")
	public String updateFacultyAttendance(@RequestBody FacultyAttendance attendance) {
		return attendanceservice.updateFacultyAttendance(attendance);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFacultyAttendance(@PathVariable int id) {
		return attendanceservice.deleteFacultyAttendance(id);
	}
}
