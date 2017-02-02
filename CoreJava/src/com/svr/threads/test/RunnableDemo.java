/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.MyRunnable;

/**
 * @author Venkata Saripella
 *
 */
public class RunnableDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread     t = new Thread(r);
        t.start();
        for(Integer i=0; i<10; i++){
            System.out.println("main thread :: "+i);
        }
    }

}
