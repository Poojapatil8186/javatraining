package com.example.onetomanydemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	private int itemid;
	private String itemdes;
	private int itemcost;
	
	@ManyToOne
	@JoinColumn(name="cartid")
	private cart cartobj;
	public int getItemid() {
		return itemid;
	}
	public Items(int itemid, String itemdes, int itemcost, cart cartobj) {
		super();
		this.itemid = itemid;
		this.itemdes = itemdes;
		this.itemcost = itemcost;
		this.cartobj = cartobj;
	}
public Items(){
		
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemdes() {
		return itemdes;
	}
	public void setItemdes(String itemdes) {
		this.itemdes = itemdes;
	}
	public int getItemcost() {
		return itemcost;
	}
	public void setItemcost(int itemcost) {
		this.itemcost = itemcost;
	}
	public cart getCartobj() {
		return cartobj;
	}
	public void setCartobj(cart cartobj) {
		this.cartobj = cartobj;
	}
	
	

}
