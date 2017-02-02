/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.MyThread;

/**
 * @author Venkata Saripella
 *
 */
public class ThreadDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        MyThread  t = new MyThread();
        t.start();
        for(Integer i=0; i<10; i++){
            System.out.println("main thread :: "+i);
        }
    }

}
