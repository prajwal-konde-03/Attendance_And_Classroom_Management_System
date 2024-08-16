package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.FacultyAttendanceDAO;
import com.springboot.entity.FacultyAttendance;

@Service
public class FacultyAttendanceService {

	@Autowired
	FacultyAttendanceDAO attendancedao;
	
	public String insertIntoFacultyAttendance(FacultyAttendance attendance) {
		return attendancedao.insertIntoFacultyAttendance(attendance);
	}

	public List<FacultyAttendance> getAllFacultyAttendance() {
		return attendancedao.getAllFacultyAttendance();
	}

	public FacultyAttendance getAllFacultyAttendanceById(int id) {
		return attendancedao.getAllFacultyAttendanceById(id);
	}

	public String updateFacultyAttendance(FacultyAttendance attendance) {
		return attendancedao.updateFacultyAttendance(attendance);
	}

	public String deleteFacultyAttendance(int id) {
		return attendancedao.deleteFacultyAttendance(id);
	}

}
