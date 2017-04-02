package com.vektorel.okul.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vektorel.okul.entity.Mudur;
import com.vektorel.okul.entity.Student;

public class Dao {

	Session session;

	public Dao() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public void addStudent(Student student) {
		session.save(student);
		session.beginTransaction().commit();
	}

	public Student getStudent(String id) {
		Student student = session.get(Student.class, id);
		return student;
	}

	public Student getStudent(int id) {
		Student student = session.get(Student.class, String.valueOf(id));
		return student;
	}

	public void addMudur(Mudur mudur) {
		session.save(mudur);
		session.beginTransaction().commit();
	}

	public Mudur getMudur(int id) {
		
		session.beginTransaction().begin();
		Mudur mudur = session.get(Mudur.class, String.valueOf(id));
		return mudur;
	}

	public void close() {
		session.close();
	}

}
