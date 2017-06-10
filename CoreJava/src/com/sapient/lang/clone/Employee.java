package com.sapient.lang.clone;

public class Employee implements Cloneable{

	String name;
	String no;
	Department dept;
	
	public Employee(String name, String no, Department dept) {
		super();
		this.name = name;
		this.no = no;
		this.dept = dept;
	}
	public Employee clone() throws CloneNotSupportedException{
		Employee e =(Employee)super.clone();
		e.setDept(e.getDept().clone());
		return e;
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
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept=new Department("It", "100");
		Employee e=new Employee("Jaya", "109", dept);
		Employee e1=e.clone();
		e1.getDept().setName("Infermatica");
		System.out.println(e.getDept().getName());
	}
}
