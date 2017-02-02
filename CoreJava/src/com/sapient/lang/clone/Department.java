package com.sapient.lang.clone;

public class Department implements Cloneable {

	String name;
	String no;
	
	public Department(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	public Department clone() throws CloneNotSupportedException{
		return (Department)super.clone();
		
	}
}
