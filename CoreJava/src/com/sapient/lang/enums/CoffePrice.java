package com.sapient.lang.enums;

public enum CoffePrice {

	COLD(10),HOT(30),SALAD(50);
	
	int price;
	private CoffePrice(int price) {
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
}
