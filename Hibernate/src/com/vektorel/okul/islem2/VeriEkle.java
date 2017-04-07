package com.vektorel.okul.islem2;

import com.vektorel.okul.Dao.Dao;
import com.vektorel.okul.entity.Student;

public class VeriEkle {
	
	public static void main(String[] args) {
		Dao dao = new Dao();

		Student student = new Student();

		student.setId(2);
		student.setName("Mustafak");

		dao.addStudent(student);
	}

}
