package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateStudents {
	public static void main(String args[]) {
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("SampleOracle");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Student student=entitymanager.find(Student.class, 100);
		//before update
		
		System.out.println(student);
		student.setAge(18);
		//entitymanager.persist(student);
		  entitymanager.getTransaction().commit();
	
		  System.out.println(student);
		  entitymanager.close();
		  emfactory.close();
	}

}
