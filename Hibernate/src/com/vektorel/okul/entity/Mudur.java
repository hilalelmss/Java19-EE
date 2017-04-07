package com.vektorel.okul.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mudur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int idMudur;

	String name;
	
	public Mudur(int id, String name) {
		this.idMudur =id;
		this.name = name;
	}

	public void setIdMudur(int idMudur) {
		this.idMudur = idMudur;
	}

	public int getIdMudur() {
		return idMudur;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

}
