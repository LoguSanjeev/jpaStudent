package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateStudent {
	public static void main(String args[]) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("SampleOracle");
		  EntityManager entitymanager=emfactory.createEntityManager();
		  entitymanager.getTransaction().begin();
		  
		  Student student =new Student();
		  student.setSid(100);
		  student.setSname("logu");
		  student.setAge(21);
		  student.setc_Class("A");
		  
		  entitymanager.persist(student);
		  entitymanager.getTransaction().commit();
		  
		  entitymanager.close();
		  emfactory.close();
	}
}