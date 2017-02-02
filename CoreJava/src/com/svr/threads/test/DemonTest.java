/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.MyRunnable;

/**
 * @author Venkata Saripella
 *
 */
public class DemonTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Start of main");
        MyRunnable myRunnable = new MyRunnable();
        Thread     t          = new Thread(myRunnable);
        t.setDaemon(true);
        t.start();
        System.out.println("End of main");
        
    }

}
