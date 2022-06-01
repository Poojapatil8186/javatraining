package com.example.movielsportslogindemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	@Id
	public int id;
	public String username;
	
	public Users() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Users(int id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	
	

}
