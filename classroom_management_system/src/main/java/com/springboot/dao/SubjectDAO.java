package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Subject;

@Repository
public class SubjectDAO {

	@Autowired
	SessionFactory factory;

	public String insertIntoSubjects(Subject subject) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(subject);

		transaction.commit();

		session.close();
		return "Subject inserted Successfully..!";
	}

	public List<Subject> getAllSubjects() {
		
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Subject.class);

		List<Subject> subjectlist = criteria.list();
		
		return subjectlist;
	}

	public Subject getSubjectById(int id) {
		
		Session session = factory.openSession();
		
		Subject subject = session.get(Subject.class, id);

		return subject;
	}

	public String updateSubject(Subject subject) {
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.update(subject);
		
		transaction.commit();
		
		session.close();
		
		return "Subject Updated Successfully..!";
	}

	public String deleteSubjectById(int id) {
		
		Session session  = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Subject subject = session.get(Subject.class,id);
		
		session.delete(subject);
		
		transaction.commit();
		
		session.close();
		
		return "Subject Deleted Successfully..!";
	}
}
