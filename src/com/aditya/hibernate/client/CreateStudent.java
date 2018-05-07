package com.aditya.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aditya.hibernate.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory= new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//use the session object to save the Java object
			
			//create a Student object
			System.out.println("Creating new Stdent object...");
			Student tempStudent = new Student("Ram", "Shyam", "ram@gmail.com");
			
			//start a transaction
			
			session.beginTransaction();
			//save the student object
			System.out.println("Saving the Stdent ...");
			session.save(tempStudent);
			//commit a transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {
			factory.close();
		}

	}

}
