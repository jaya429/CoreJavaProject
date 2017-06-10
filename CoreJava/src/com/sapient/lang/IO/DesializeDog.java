package com.sapient.lang.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesializeDog {

	public static void main(String[] args) {
		Dog d=null;
		try{
		FileInputStream fis = new FileInputStream("testSer.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		 d = (Dog) ois.readObject();
		ois.close();
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
		System.out.println("after: collar size is "+ d.getPrice());
	}
}
