package com.demo.JPAHib1toMUniMapping.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "did")
    private int did;

    @Column(name = "dname")
    private String name;

    public Department() {}

	public Department(int id,String name) {
		super();
		did=id;
		this.name = name;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + "]";
	}

	

	

   
}

