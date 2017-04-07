package com.vektorel.okul.islem2;

import com.vektorel.okul.Dao.Dao;
import com.vektorel.okul.entity.Mudur;
import com.vektorel.okul.entity.Okul;
import com.vektorel.okul.entity.Student;

public class VeriEkle {
	
	public static void main(String[] args) {
		Dao dao = new Dao();

		Student student = new Student();

		student.setId(1);
		student.setName("Mustafak");



        Okul okul = new Okul();
        okul.setId(1);
        okul.setName("Mustafak");

        dao.addOkul(okul);


        student.setOkul(okul);

        dao.addStudent(student);

        Mudur mudur = new Mudur();
        mudur.setName("Mustafak");


        dao.addMudur(mudur);

    }

}
