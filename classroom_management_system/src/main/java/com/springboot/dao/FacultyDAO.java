package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Faculty;

@Repository
public class FacultyDAO {
	
	@Autowired
	SessionFactory factory;

	public String insertIntoFaculty(Faculty faculty) {

		Session session= factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(faculty);
		
		transaction.commit();
		
		session.close();
		
		
		return "Faculty Inserted Successfuly..!" ;
	}

	public List<Faculty> getAllFaculties() {
		
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Faculty.class);
		
		List<Faculty> facultieslist = criteria.list();
		
		return facultieslist;
	}

	public Faculty getFacultyById(int id) {

		Session session = factory.openSession();
		
		Faculty faculty = session.get(Faculty.class, id);
		
		return faculty;
	}

	public String updateFaculty(Faculty faculty) {

		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.update(faculty);
		
		transaction.commit();
		
		session.close();
		
		return "Faculty Updated Successfully..!";
	}

	public String deleteFacultyById(int id) {
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Faculty faculty = session.get(Faculty.class,id);
		
		session.delete(faculty);
		
		transaction.commit();
		
		session.close();
		return "Faculty Deleted Succesfully..!";
	}
	

}
