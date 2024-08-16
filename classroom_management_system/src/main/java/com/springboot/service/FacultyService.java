package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.FacultyDAO;
import com.springboot.entity.Faculty;

@Service
public class FacultyService {
	
	@Autowired
	FacultyDAO dao;

	public String insertIntoFaculty(Faculty faculty) {
		return dao.insertIntoFaculty(faculty) ;
	}

	public List<Faculty> getAllFaculties() {
		return dao.getAllFaculties();
	}

	public Faculty getFacultyById(int id) {
		return dao.getFacultyById(id);
	}

	public String updateFaculty(Faculty faculty) {
		return dao.updateFaculty(faculty);
	}

	public String deleteFacultyById(int id) {
		return dao.deleteFacultyById(id);
	}
	
	
}
