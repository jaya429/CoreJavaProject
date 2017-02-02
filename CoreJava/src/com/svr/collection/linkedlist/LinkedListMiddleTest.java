/**
 * 
 */
package com.svr.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Venkata Saripella
 *
 */
public class LinkedListMiddleTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> elements = new LinkedList<Integer>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        System.out.println(elements.get(elements.size()/2));
        
    }

}
