package com.vektorel.okul.islem2;

import com.vektorel.okul.Dao.Dao;
import com.vektorel.okul.entity.Student;

public class VeriCekme {
	
	public static void main(String[] args) {

		Dao dao = new Dao();

		Student student = dao.getStudent(2);

		System.out.println(student.getName());

	}

}
