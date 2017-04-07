package com.vektorel.okul.Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vektorel.okul.entity.Mudur;
import com.vektorel.okul.entity.Student;

public class Dao {


	SessionFactory sessionFactory;

	public Dao() {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public void addStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(student);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

	public Student getStudent(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Student student1 = null;
		try{
			tx = session.beginTransaction();
			student1 = session.get(Student.class,id);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return student1;
	}

//	public void addMudur(Mudur mudur) {
//		session.save(mudur);
//		session.beginTransaction().commit();
//	}
//
//	public Mudur getMudur(int id) {
//
//		session.beginTransaction().begin();
//		Mudur mudur = session.get(Mudur.class, String.valueOf(id));
//		return mudur;
//	}
//
//	public void close() {
//		session.close();
//	}

}
