package com.sapient.lang.IO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2365123496546000299L;
	private String type;
	private String color;
	private String name;
	private transient String price;
	public Dog(String type, String color, String name) {
		super();
		this.type = type;
		this.color = color;
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	private void writeObject(ObjectOutputStream stream) throws IOException{
		stream.defaultWriteObject();
		price = "123";
		stream.writeObject(price);
	}
	 
	private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException{
		stream.defaultReadObject();
		price = (String) stream.readObject();
	}
	
	
	
}
