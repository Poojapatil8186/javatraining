package com.example.webassingementdemo;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	int empid;
	String name;
	String address;
	String email;
	int phone;
	int scalary;
	public Emp() 
	{
	
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getScalary() {
		return scalary;
	}
	public void setScalary(int scalary) {
		this.scalary = scalary;
	}
	public Emp(int empid, String name, String address, String email, int phone, int scalary) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.scalary = scalary;
	}
	public static Optional<Emp> findById(Integer empId2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
