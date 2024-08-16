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

import com.springboot.entity.Classroom;
import com.springboot.service.ClassroomService;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/api/classroom")
public class ClassroomController {
	
	@Autowired
	ClassroomService service;
	
	@PostMapping("/insert")
	public String insertIntoClassroom(@RequestBody Classroom classroom){
		return service.insertIntoClassroom(classroom);
	}
	
	@GetMapping("/all")
	public List<Classroom> getAllClassRooms(){
		return service.getAllClassRooms();
	}
	
	@GetMapping("/byid/{id}")
	public Classroom getClassRoomById(@PathVariable int id) {
		return service.getClassRoomById(id);
	}
	
	@PutMapping("/update")
	public String updateClassroom(@RequestBody Classroom classroom) {
		return service.updateClassroom(classroom);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteClassroomById(@PathVariable int id) {
		return service.deleteClassroomById(id);
	}
	

}














