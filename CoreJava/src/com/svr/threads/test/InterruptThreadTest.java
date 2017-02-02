/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.InterruptThread;

/**
 * @author Venkata Saripella
 *
 */
public class InterruptThreadTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        InterruptThread it = new InterruptThread();
        Thread          t  = new Thread(it);
        t.start();
        t.interrupt();
        System.out.println("End Main Thread");
    }

}
