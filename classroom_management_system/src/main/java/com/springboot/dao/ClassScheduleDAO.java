package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.ClassSchedule;

@Repository
public class ClassScheduleDAO {
	
	@Autowired
	SessionFactory factory;

	public String insertIntoClassSchedules(ClassSchedule schedules) {
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();;
		
		session.save(schedules);
		
		transaction.commit();
		
		session.close();
		
		return "Added";
	}

	public List<ClassSchedule> getAllClassSchedules() {
		
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(ClassSchedule.class);
		
		List<ClassSchedule> classscheduleslist = criteria.list();
		
		return classscheduleslist;
	}

	public ClassSchedule getClassScheduleById(int id) {
		
		Session session = factory.openSession();
		
		ClassSchedule classSchedule = session.get(ClassSchedule.class, id);
		
		return classSchedule;
	}

	public String updateClassSchedule(ClassSchedule classSchedule) {
		
		Session session = factory.openSession();
		
		Transaction transaction =  session.beginTransaction();
		
	 session.update(classSchedule);
	 
	 transaction.commit();
	 session.close();
		return "Updated Succesfully..!";
	}

	public String deleteClassScheduleById(int id) {
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		ClassSchedule classSchedule = session.get(ClassSchedule.class,id);
		
		session.delete(classSchedule);
		
		transaction.commit();
		
		session.close();
		return "Deleted Succesfully..!";
	}
	
	

}
