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

import com.springboot.entity.Subject;
import com.springboot.service.SubjectService;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
	
	@Autowired
	SubjectService service;
	
	@PostMapping("/insert")
	public String insertIntoSubjects(@RequestBody Subject subject) {
		return service.insertIntoSubjects(subject);
	}
	
	@GetMapping("/all")
	public List<Subject> getAllSubjects(){
		return service.getAllSubjects();
	}
	
	@GetMapping("/byid/{id}")
	public Subject getSubjectById(@PathVariable int id) {
		return service.getSubjectById(id);
	}

	@PutMapping("/update")
	public String updateSubject(@RequestBody Subject subject) {
		return service.updateSubject(subject);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSubjectById(@PathVariable int id) {
		return service.deleteSubjectById(id);
		
	}
}
