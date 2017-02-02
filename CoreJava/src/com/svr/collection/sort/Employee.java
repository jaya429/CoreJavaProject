package com.svr.collection.sort;

/**
 * @author Venkata Saripella
 *
 */
public class Employee /*implements Comparable<Employee>*/{

    private String firstName;
    private String lastName;
    private int    id;
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
    }
    
    /*@Override
    public int compareTo(Employee o) {
        return o.getFirstName().compareTo(firstName);
    }*/
    
}
