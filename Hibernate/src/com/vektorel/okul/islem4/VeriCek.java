package com.vektorel.okul.islem4;

import com.vektorel.okul.Dao.Dao;
import com.vektorel.okul.entity.Okul;

import java.util.List;

/**
 * Created by mustafa.ergan on 11.04.2017.
 */
public class VeriCek {

    public static void main(String[] args) {
        Dao dao = new Dao();
        List<Okul> list = dao.getOkulWithCriteriaMaxResults();

        for (Okul okul:list) {
            System.out.println(okul.getName());
        }

        System.out.println("-----------------------------------");

        list = dao.getOkulWithCriteriaLike();

        for (Okul okul:list) {
            System.out.println(okul.getName());
        }

        System.out.println("-----------------------------------");

        list = dao.getOkulWithCriteriabetween();

        for (Okul okul:list) {
            System.out.println(okul.getName());
        }

        System.out.println("-----------------------------------");

        list = dao.getOkulWithCriteriaEq();

        for (Okul okul:list) {
            System.out.println(okul.getName());
        }

    }
}
