/**
 * 
 */
package com.svr.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Venkata Saripella
 *
 */
public class SortingTest {

    public static void main(String...strings){
        
        Employee e1 = new Employee();
        e1.setFirstName("Venkat");
        e1.setLastName("b");
        e1.setId(1);
        
        Employee e2 = new Employee();
        e2.setFirstName("kasi");
        e2.setLastName("a");
        e2.setId(1);
        
        Employee e3 = new Employee();
        e3.setFirstName("kasi");
        e3.setLastName("c");
        e3.setId(1);
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Before sorting :: "+employees);
        
        List<Employee> emps = new ArrayList<Employee>(employees);
        Collections.sort(emps, new A());
//        Collections.sort(emps); natural sorting order
        System.out.println("After sorting :: "+emps);
        
        
    }
}
