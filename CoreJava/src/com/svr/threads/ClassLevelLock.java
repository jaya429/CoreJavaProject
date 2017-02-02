/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class ClassLevelLock {
    public static synchronized void wish(String name){
        for(Integer i=0; i<10; i++){
            System.out.print("Good Morning ::  ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
