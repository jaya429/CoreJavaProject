/**
 * 
 */
package com.svr.collection.map;

/**
 * @author Venkata Saripella
 *
 */
public class Employee {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    /** 
     * 
     * Case 1 :: 
     * 
     * Not override hashcode and equals methods and added 6 employee's objects into map as keys
     * 
     * Results::
     * 
     * Map size is :: 6
     * Get e6 objcet :: 6
     * Get new object :: null
     * Contains new objects :: false
     * Contains e6 object :: true
     */
   
      
    /**
     * Case 2 ::
     * 
     * overriding hashcode method which always returns 1 as hashcode of employee
     * 
     * Added 6 employee objects to map as key 
     * 
     * Results:: 
     * 
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * 
     * Map size is :: 6
     * 
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Get e6 objcet :: 6
     * 
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Get new object:: null
     * 
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Contains new objects :: false
     * 
     * Employee's hashcode method invoked and returns hashcode as 1 always
     * Contains e6 object :: true
     */
    /*@Override
    public int hashCode() {
        System.out.println("Employee's hashcode method invoked and returns hashcode as 1 always");
        return 1;
    }*/
    
    
    
    /**
     * 
     * Case 3 ::
     * 
     * overriding hashcode method which returns employee Id as hashcode of employee
     * 
     * Results ::
     * 
     * Employee's hashcode method invoked and returns the hashcode as employee's Id always
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
    
       Map size is :: 6
       
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
       Get e6 objcet :: 6
       
       Employee's hashcode method invoked and returns the hashcode as employee's Id always
       
        Exception in thread "main" java.lang.NullPointerException
        at com.svr.collection.Employee.hashCode(Employee.java:83)
        at java.util.HashMap.hash(HashMap.java:338)
        at java.util.HashMap.get(HashMap.java:556)
        at com.svr.collection.MapCases.main(MapCases.java:47)

     */
    /*@Override
    public int hashCode() {
        System.out.println("Employee's hashcode method invoked and returns the hashcode as employee's Id always");
        return id;
    }*/
    
    
    /**
     * Case 4 ::
     * 
     * Overriding hashcode method which always returns 1 as hashcode of employee
     * 
     * Overriding equals  method which always returns true as hashcode of employee
     * 
     * 
     * Results ::
     * 
     *  Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Map size is :: 1
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Get e6 objcet :: 6
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Get new object:: 6
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Contains new objects :: true
        Employee's hashcode method invoked and returns hashcode as 1 always
        Employee's equals method invoked and returns always true
        Contains e6 object :: true
     * 
     */
    /*@Override
    public int hashCode() {
        System.out.println("Employee's hashcode method invoked and returns hashcode as 1 always");
        return 1;
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("Employee's equals method invoked and returns always true");
        return true;
    }*/
    
    @Override
    public int hashCode() {
        System.out.println("Eclipse generated hashcode method executed");
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Eclipse generated equals method executed");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    /**
     * Result ::
     * 
     * Eclipse generated hashcode method executed
        Eclipse generated hashcode method executed
        Eclipse generated hashcode method executed
        Eclipse generated hashcode method executed
        Eclipse generated hashcode method executed
        Eclipse generated hashcode method executed
        Map size is :: 6
        Eclipse generated hashcode method executed
        Get e6 objcet :: 6
        Eclipse generated hashcode method executed
        Get new object:: null
        Eclipse generated hashcode method executed
        Contains new objects :: false
        Eclipse generated hashcode method executed
        Contains e6 object :: true

     */
}
