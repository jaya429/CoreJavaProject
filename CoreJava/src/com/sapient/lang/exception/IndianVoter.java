package com.sapient.lang.exception;

public class IndianVoter {

	private static final Integer AGE=18;
	
	public void isEligibeForVote(int age) throws MyException{
		if(age<AGE){
			throw new MyException("is not eligible for Vote");
		}
	}
	
	public static void main(String[] args) throws MyException {
		IndianVoter obj = new IndianVoter();
		obj.isEligibeForVote(17);
	}
}
