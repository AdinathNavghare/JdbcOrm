package com.app.Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.app.model.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		Integer result = (Integer) this.hibernateTemplate.save(student);
		return result;

	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

}
