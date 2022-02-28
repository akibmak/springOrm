package com.akib.springOrm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.akib.springOrm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	//save student
	@Transactional
	public int insert(Student student) 
	{
		// insert student object using hibernate template save method
		Integer i=(Integer)this.hibernateTemplate.save(student); //save method calls hibernate Session save method.
		return 1;//one row affected
	}


	public HibernateTemplate getHibernateTemplate() {
		return this.hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
