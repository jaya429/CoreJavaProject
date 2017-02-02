/**
 * 
 */
package com.svr.collection.sort;

import java.util.Comparator;

/**
 * @author Venkata Saripella
 *
 */
public class A implements Comparator<Employee> {

    /* (non-Javadoc)
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        System.out.println("entered in to compare method");
        
        return o1.getLastName().compareTo(o2.getLastName());
    }

}
