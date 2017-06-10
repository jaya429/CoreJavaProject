package com.sapient.lang.enums;

public class TestDays {

	public enum Days { MON, TUE, WED };
	
	
	public static void main(String[] args) {
		Integer a=1271;
		int a1=1271;
		
		int b1=new Integer(128);
		Boolean b =Boolean.valueOf("true");
		if(a==a1){
			System.out.println("true");
		}
		for(Days d : Days.values()){
			;
			Days[] days = Days.values();
			System.out.println(days[2]);
 		}
	}
}
