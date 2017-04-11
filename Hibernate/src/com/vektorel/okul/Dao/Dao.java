package com.vektorel.okul.Dao;

import com.vektorel.okul.entity.Okul;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.vektorel.okul.entity.Mudur;
import com.vektorel.okul.entity.Student;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Dao {

	SessionFactory sessionFactory;

	public Dao() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
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

    public void addMudur(Mudur mudur) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(mudur);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
    }

	public void addOkul(Okul okul) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			session.save(okul);
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}


	public List getOkulWithCriteriaMaxResults() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List values =null;
		try{
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Okul.class);
			crit.setMaxResults(4);
			values = crit.list();
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

		return values;
	}

	public List getOkulWithCriteriaLike() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List values =null;
		try{
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Okul.class);
			crit.add(Restrictions.like("name","%h%"));
			values = crit.list();
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

		return values;
	}


	public List getOkulWithCriteriabetween() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List values =null;
		try{
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Okul.class);
			crit.add( Restrictions.between("id", 3, 4) );
			values = crit.list();
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

		return values;
	}


	public List getOkulWithCriteriaEq() {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		List values =null;
		try{
			tx = session.beginTransaction();
			Criteria crit = session.createCriteria(Okul.class);
			crit.add( Restrictions.eq("id", 2) );
			values = crit.list();
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}

		return values;
	}
}
