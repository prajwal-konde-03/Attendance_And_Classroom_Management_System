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

import com.springboot.entity.ClassSchedule;
import com.springboot.service.ClassScheduleService;

@RestController
@RequestMapping("/api/classschedules")
public class ClassScheduleController {
	
	@Autowired
	ClassScheduleService service;
	
	@PostMapping("/insert")
	public String insertIntoClassSchedules(@RequestBody ClassSchedule schedules) {
		return service.insertIntoClassSchedules(schedules);
	}
	
	@GetMapping("/all")
	public List<ClassSchedule> getAllClassSchedules(){
		return service.getAllClassSchedules();
	}
	
	@GetMapping("/getclassschedulesbyid/{id}")
	public ClassSchedule getClassScheduleById(@PathVariable int id) {
		return service.getClassScheduleById(id);
	}
	
	@PutMapping("/update")
	public String updateClassSchedule(@RequestBody ClassSchedule classSchedule) {
		return service.updateClassSchedule(classSchedule);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteClassScheduleById(@PathVariable int id) {
		return service.deleteClassScheduleById(id);
		
	}
	
}
