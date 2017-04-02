package com.vektorel.okul.islem;

import com.vektorel.okul.Dao.Dao;
import com.vektorel.okul.entity.Mudur;
import com.vektorel.okul.entity.Student;

public class VeriEkle {
	
	public static void main(String[] args) {
		Dao dao = new Dao();
		
		Student student = new Student();
		student.setId(0);
		student.setName("Mustafa");
		
		Mudur mudur = new Mudur("1","Mahmut");
		
		dao.addMudur(mudur);
		
		dao.addStudent(student);
		
		Mudur mudur3 = dao.getMudur(1);
		
		System.out.println(mudur3.getName());
		
		dao.close();
	}

}
