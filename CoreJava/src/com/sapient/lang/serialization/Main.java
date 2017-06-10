package com.sapient.lang.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestClass testWrite = new TestClass("valueOne", "valueTwo");
	    FileOutputStream fos = new FileOutputStream("testfile");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(testWrite);
	    oos.flush();
	    oos.close();
	      
	    TestClass testRead;
	    FileInputStream fis = new FileInputStream("testfile");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    testRead = (TestClass) ois.readObject();
	    ois.close();
	      
	    System.out.println("--Serialized object--");
	    System.out.println("propertyOne: " + testWrite.getPropertyOne());
	    System.out.println("propertyTwo: " + testWrite.getPropertyTwo());
	    System.out.println("");
	    System.out.println("--Read object--");
	    System.out.println("propertyOne: " + testRead.getPropertyOne());
	    System.out.println("propertyTwo: " + testRead.getPropertyTwo());
	}
}
