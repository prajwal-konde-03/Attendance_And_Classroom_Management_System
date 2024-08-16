package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.DepartmentDAO;
import com.springboot.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDAO dao;
	
	public String insertIntoDepartment(Department department) {
		return dao.insertIntoDepartment(department);
	}

	public List<Department> getAllDepartment() {
		return dao.getAllDepartment();
	}

	public Department getDepartmentById(int id) {
		return dao.getDepartmentById(id);
	}

	public String updateDepartment(Department department) {
		return dao.updateDepartment(department);
	}

	public String deleteDepartment(int id) {
		return dao.deleteDepartment(id);
	}

}
