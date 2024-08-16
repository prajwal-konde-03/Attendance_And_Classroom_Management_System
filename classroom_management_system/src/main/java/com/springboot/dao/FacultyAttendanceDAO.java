package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.FacultyAttendance;

@Repository
public class FacultyAttendanceDAO {

	@Autowired
	SessionFactory factory;

	public String insertIntoFacultyAttendance(FacultyAttendance attendance) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(attendance);

		transaction.commit();

		session.close();

		return "Data inserted Successfully..!";
	}

	public List<FacultyAttendance> getAllFacultyAttendance() {

		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(FacultyAttendance.class);

		List<FacultyAttendance> attendancelist = criteria.list();

		return attendancelist;
	}

	public FacultyAttendance getAllFacultyAttendanceById(int id) {

		Session session = factory.openSession();

		FacultyAttendance attendance = session.get(FacultyAttendance.class, id);

		return attendance;
	}

	public String updateFacultyAttendance(FacultyAttendance attendance) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.update(attendance);

		transaction.commit();

		session.close();
		return "Updated Succesfully..!";
	}

	public String deleteFacultyAttendance(int id) {

		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		FacultyAttendance attendance = session.get(FacultyAttendance.class, id);
		
		session.delete(attendance);
		
		transaction.commit();
		
		session.close();

		return "Deleted Successfully..!";
	}

}
