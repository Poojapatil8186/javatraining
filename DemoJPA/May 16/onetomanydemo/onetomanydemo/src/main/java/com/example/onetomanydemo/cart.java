package com.example.onetomanydemo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;


@Entity
public class cart {
	@Id
	private int cartid;
	private String uname;
	
	@OneToMany(mappedBy="cartobj")
	private Set<Items> items;
       public cart() {
		
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	public cart(int cartid, String uname) {
		super();
		this.cartid = cartid;
		this.uname = uname;
		//this.items = items;
	}
	
	
	
}
	