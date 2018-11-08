package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteStudents {
	public static void main(String args[]) {
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("SampleOracle");
		EntityManager entitymanager=emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Student student=entitymanager.find(Student.class, 100);
		entitymanager.remove(student);
		entitymanager.getTransaction().commit();
		entitymanager.close();
}
}