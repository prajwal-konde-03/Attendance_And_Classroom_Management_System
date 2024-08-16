package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.ClassroomDAO;
import com.springboot.entity.Classroom;

@Service

public class ClassroomService {

	@Autowired
	ClassroomDAO dao;

	public String insertIntoClassroom(Classroom classroom) {
		return dao.insertIntoClassroom(classroom);
	}

	public List<Classroom> getAllClassRooms() {
		return dao.getAllClassRooms();
	}

	public Classroom getClassRoomById(int id) {
		return dao.getClassRoomById(id);
	}

	public String updateClassroom(Classroom classroom) {
		return dao.updateClassroom(classroom);
	}

	public String deleteClassroomById(int id) {
		return dao.deleteClassroomById(id);
	}

}
