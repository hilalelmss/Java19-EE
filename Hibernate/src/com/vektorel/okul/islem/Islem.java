package com.vektorel.okul.islem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vektorel.okul.entity.Student;

public class Islem {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Student student = new Student();
		Student student2 = new Student();

		student.setId(10);
		student.setName("mahmut");
		
		session.save(student);
		
		student2.setId(11);
		student2.setName("Ahmet");
		
		session.save(student2);
		
		session.flush();
		
		Student student3 = session.get(Student.class, 11);
		
		System.out.println(student3.getId());
		
		session.beginTransaction().commit();
		session.close();
	}

}
