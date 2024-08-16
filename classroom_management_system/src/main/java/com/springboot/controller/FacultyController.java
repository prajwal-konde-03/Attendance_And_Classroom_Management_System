package com.springboot.controller;

import java.util.List;

import org.hibernate.boot.model.source.spi.FetchableAttributeSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Faculty;
import com.springboot.service.FacultyService;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {
	
	@Autowired
	FacultyService service;
	
	@PostMapping("/insert")
	public String insertIntoFaculty(@RequestBody Faculty faculty) {
		return service.insertIntoFaculty(faculty);
	}

	@GetMapping("/all")
	public List<Faculty> getAllFaculties(){
		return service.getAllFaculties();
	}
	
	@GetMapping("/byid/{id}")
	public Faculty getFacultyById(@PathVariable int id) {
		return service.getFacultyById(id);
	}
	
	@PutMapping("/update")
	public String updateFaculty(@RequestBody Faculty faculty) {
		return service.updateFaculty(faculty);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFacultyById(@PathVariable int id) {
		return service.deleteFacultyById(id);
	}
}
