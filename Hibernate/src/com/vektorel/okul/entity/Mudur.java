package com.vektorel.okul.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mudur {
	
	@Id
	String idMudur;
	String name;
	
	
	public Mudur(int id, String name) {
		this.idMudur =String.valueOf(id);
		this.name = name;
	}
	
	public Mudur(String id, String name) {
		this.idMudur = id;
		this.name = name;
	}
	
	
	public void setIdMudur(String idMudur) {
		this.idMudur = idMudur;
	}
	
	public String getIdMudur() {
		return idMudur;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

}
