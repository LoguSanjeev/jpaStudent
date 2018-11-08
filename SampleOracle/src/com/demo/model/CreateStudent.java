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
		  student.setSid(105);
		  student.setSname("logu3");
		  student.setAge(21);
		  student.setc_Class("A");
		  
		  Student student1 =new Student(106,"raveena",21,"a");

//		  student.setSid(101);
//		  student.setSname("logu1");
//		  student.setAge(21);
//		  student.setc_Class("A");
//		  
//		 		  student.setSid(102);
//		  student.setSname("logu2");
//		  student.setAge(21);
//		  student.setc_Class("A");
		  

		  entitymanager.persist(student1);
		  
		  entitymanager.persist(student);
		  entitymanager.getTransaction().commit();
		  
		  entitymanager.close();
		  emfactory.close();
	}
}