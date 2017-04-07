package com.vektorel.okul.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mustafa.ergan on 07.04.2017.
 */

@Entity
public class Okul {

    @Id
    int id;
    String name;


    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
