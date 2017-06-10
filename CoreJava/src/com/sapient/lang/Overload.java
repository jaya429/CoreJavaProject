package com.sapient.lang;

public  class Overload {

	
	public static void go(Integer a){
		System.out.println("Integer");
	}
	public static void go(long a){
		System.out.println("short");
	}
	/*public static void go(String a){
		System.out.println("SubClass Object");
	}*/
	public static void go(Object a){
		System.out.println("Object");
	}
	
	public static  void main(String[] args) {
		/*short s=10;
		go(s);*/
		boolean flag = false;
		if(flag=true){
			System.out.println("true");
		}
		go(50);
		go(null);
	}
}
