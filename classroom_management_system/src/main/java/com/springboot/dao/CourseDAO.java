package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.hql.internal.ast.tree.SessionFactoryAwareNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Course;

@Repository
public class CourseDAO {

	@Autowired
	SessionFactory factory;

	public String insertIntoCourse(Course course) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(course);

		transaction.commit();

		session.close();
		return "Data inserted successfully..!";
	}

	public List<Course> getAllCourses() {

		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Course.class);

		List<Course> courselist = criteria.list();

		return courselist;
	}

	public Course getCurseById(int id) {

		Session session = factory.openSession();

		Course course = session.get(Course.class, id);

		return course;
	}

	public String updateCourse(Course course) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.update(course);

		transaction.commit();

		session.close();
		return null;
	}

	public String deleteCourse(int id) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Course course = session.get(Course.class, id);

		session.delete(course);
		transaction.commit();
		session.close();
		return "Course Deleted Successfully..!";
	}

}
