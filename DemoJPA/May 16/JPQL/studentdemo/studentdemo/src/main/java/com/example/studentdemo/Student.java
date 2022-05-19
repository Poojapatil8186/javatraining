package com.example.studentdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	
	 @Id
	 private int id ;
	 //  @Column(Name ,"name")
	 private String name;
	 public Student(){
	 	
	 }
	 

	 public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int id,String name){
	   this.id=id;
	   this.name=name;
	 }


}
