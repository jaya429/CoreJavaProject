package com.sapient.lang.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {
	public static void main(String[] args) {
		Dog d = new Dog("dobor","red" ,"tommy");
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) { e.printStackTrace(); }
	}
}