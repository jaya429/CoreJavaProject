/**
 * 
 */
package com.svr.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Venkata Saripella
 *
 */
public class CommunicatingLegacyNonGenerics {
    
    public static void m1(List l){
       
        l.add(10);
        l.add(true);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<String>  l = new ArrayList<String>();
        l.add("A");
        l.add("B");
//        l.add(10);
        m1(l);
        System.out.println(l);  //[A, B, 10, true]
   }

}
