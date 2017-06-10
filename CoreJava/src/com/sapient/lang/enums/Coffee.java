package com.sapient.lang.enums;

import java.util.Arrays;

public class Coffee {

	static CoffePrice price;
	public static void main(String[] args) {
	
		price = CoffePrice.COLD;
		System.out.println(price.getPrice());
		Arrays.asList(CoffePrice.values()).
		forEach(t->{
			System.out.println(t.getPrice());
		});
		}
}
