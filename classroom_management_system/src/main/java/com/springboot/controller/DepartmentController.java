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

import com.springboot.entity.Department;
import com.springboot.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/insert")
	public String insertIntoDepartment(@RequestBody Department department) {
		return service.insertIntoDepartment(department);
	}
	
	@GetMapping("/all")
	public List<Department> getAllDepartment(){
		return service.getAllDepartment();
	}
	
	@GetMapping("/byid/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		return service.getDepartmentById(id);
	}
	
	@PutMapping("/update")
	public String updateDepartment(@RequestBody Department department) {
		return service.updateDepartment(department);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable int id) {
		return service.deleteDepartment(id);
	}
}
