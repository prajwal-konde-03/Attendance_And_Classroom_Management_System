package com.springboot.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.entity.Department;

@Repository
public class DepartmentDAO {

	@Autowired
	SessionFactory factory;

	public String insertIntoDepartment(Department department) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(department);

		transaction.commit();

		session.close();
		return "Data inserted successfully..!";
	}

	public List<Department> getAllDepartment() {

		Session session = factory.openSession();

		Criteria criteria = session.createCriteria(Department.class);

		List<Department> deptlist = criteria.list();

		return deptlist;
	}

	public Department getDepartmentById(int id) {

		Session session = factory.openSession();

		Department department = session.get(Department.class, id);

		return department;
	}

	public String updateDepartment(Department department) {
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		session.update(department);

		transaction.commit();

		session.close();

		return "Department Updated Successfully..!";
	}

	public String deleteDepartment(int id) {

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Department dept = session.get(Department.class, id);
		
		session.delete(dept);
		
		transaction.commit();
		
		session.close();

		return "Department Deleted Successfully..!";
	}

}
