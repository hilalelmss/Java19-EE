package com.vektorel.okul.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
	
	@Id
	private int id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "okul_id")
    private Okul okul;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "mudur_student" , joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "mudur_id"))
	List<Mudur> mudurs = new ArrayList<>();


	public void setMudurs(List<Mudur> mudurs) {
		this.mudurs = mudurs;
	}

	public List<Mudur> getMudurs() {
		return mudurs;
	}

	public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

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
