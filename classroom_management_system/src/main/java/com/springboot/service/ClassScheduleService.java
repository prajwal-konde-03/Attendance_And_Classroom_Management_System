package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.ClassScheduleDAO;
import com.springboot.entity.ClassSchedule;

@Service
public class ClassScheduleService {

	@Autowired
	ClassScheduleDAO dao;
	
	public String insertIntoClassSchedules(ClassSchedule schedules) {
		return dao.insertIntoClassSchedules(schedules);
	}

	public List<ClassSchedule> getAllClassSchedules() {
		return dao.getAllClassSchedules();
	}

	public ClassSchedule getClassScheduleById(int id) {
		return dao.getClassScheduleById(id);
	}

	public String updateClassSchedule(ClassSchedule classSchedule) {
		return dao.updateClassSchedule(classSchedule);
	}

	public String deleteClassScheduleById(int id) {
		return dao.deleteClassScheduleById(id);
	}

}
