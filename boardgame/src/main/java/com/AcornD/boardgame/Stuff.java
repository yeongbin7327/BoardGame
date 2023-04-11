package com.AcornD.boardgame;

import java.io.Serializable;

public class Stuff implements Serializable{
	private String name;
	private int price;
	
	public Stuff() {}
	public Stuff(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	public void buy() {}
	
	public String toString() {
		return " 메뉴 : " + getName() + " 가격 : " + getPrice();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
