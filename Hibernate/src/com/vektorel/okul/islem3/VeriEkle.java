package com.vektorel.okul.islem3;

import com.vektorel.okul.Dao.Dao;
import com.vektorel.okul.entity.Mudur;
import com.vektorel.okul.entity.Okul;
import com.vektorel.okul.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class VeriEkle {

    public static void main(String[] args) {
        Dao dao = new Dao();

        Mudur ahmet = new Mudur();
        ahmet.setName("Ahmet");
//        ahmet.setId(1);
        dao.addMudur(ahmet);

        Mudur mehmet = new Mudur();
        mehmet.setName("mehmet");
        dao.addMudur(mehmet);

        List<Mudur> mudurs = new ArrayList<>();
        mudurs.add(ahmet);
        mudurs.add(mehmet);

        Student student = new Student();

        student.setId(1);
        student.setName("Mustafak");

        Okul okul = new Okul();
        okul.setId(2);
        okul.setName("Mustafak");

        dao.addOkul(okul);


        student.setOkul(okul);
        student.setMudurs(mudurs);

        dao.addStudent(student);


    }

}
