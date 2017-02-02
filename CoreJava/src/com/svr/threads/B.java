/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class B {

    public static synchronized void printName(){
        try {
            System.out.println("printName");
            Thread.sleep(5*1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public  synchronized void printValue(){
        
            System.out.println("printValue");
        
    }
}
