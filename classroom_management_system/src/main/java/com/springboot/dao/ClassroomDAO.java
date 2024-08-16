package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Classroom;

@Repository
public class ClassroomDAO {

	@Autowired
	SessionFactory factory;

	public String insertIntoClassroom(Classroom classroom) {

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(classroom);

		tx.commit();
		session.close();
		return "added";
	}

	public List<Classroom> getAllClassRooms() {

		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Classroom.class);

		List<Classroom> classroomslist = criteria.list();

		return classroomslist;
	}

	public Classroom getClassRoomById(int id) {

		Session session = factory.openSession();

		Classroom classroom = session.get(Classroom.class, id);
		return classroom;

	}

	public String updateClassroom(Classroom classroom) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.update(classroom);
		
		transaction.commit();
		
		session.close();
		
		return "Updated";
	}

	public String deleteClassroomById(int id) {
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Classroom classroom =  session.get(Classroom.class, id);
		
		session.delete(classroom);
		
		transaction.commit();
		session.close();
		
		return "deleted";
	}

}
