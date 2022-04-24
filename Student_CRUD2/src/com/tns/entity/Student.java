package com.tns.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="students")
public class Student implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	private int studentId;
	private String name;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
