package com.sapient.lang.exception;

public class ReturnInException {

	public int cal(int a){
		try {
			int c = a/1;
			return 1;
		} catch (NullPointerException e) {
			return 2;
		}finally{
			return 3;
		}
	}
	
	public static void main(String[] args) {
		ReturnInException obj = new ReturnInException();
		int result = obj.cal(10);
		System.out.println(result);
	}
}
