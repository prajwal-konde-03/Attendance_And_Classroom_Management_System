package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.SubjectDAO;
import com.springboot.entity.Subject;

@Service
public class SubjectService {
	
	@Autowired
	SubjectDAO dao;

	public String insertIntoSubjects(Subject subject) {
		return dao.insertIntoSubjects(subject);
	}

	public List<Subject> getAllSubjects() {
		return dao.getAllSubjects();
	}

	public Subject getSubjectById(int id) {
		
		return dao.getSubjectById(id);
	}

	public String updateSubject(Subject subject) {
		return dao.updateSubject(subject);
	}

	public String deleteSubjectById(int id) {
		return dao.deleteSubjectById(id);
	}

}
