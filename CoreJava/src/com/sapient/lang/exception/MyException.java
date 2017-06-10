package com.sapient.lang.exception;

public class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	
	String msg="";
	
	public  MyException(String msg){
		super(msg);
		this.msg =msg;
	}

}
