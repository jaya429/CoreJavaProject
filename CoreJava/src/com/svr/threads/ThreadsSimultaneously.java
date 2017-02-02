/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class ThreadsSimultaneously  {

    public synchronized static void method1(){
        System.out.println("method1");
        for(Integer i=0;i<10; i++){
            System.out.println("Rama");
        }
    }
    
    public synchronized static void method2(){
        System.out.println("method2");
        for(Integer i=0;i<10; i++){
            System.out.println("Raju");
        }
    }
}
