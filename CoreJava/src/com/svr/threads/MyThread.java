/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class MyThread extends Thread {
    
    @Override
    public void run(){
        for(Integer i=0; i<10; i++){
            System.out.println("child thread :: "+i);
        }
    }

}
