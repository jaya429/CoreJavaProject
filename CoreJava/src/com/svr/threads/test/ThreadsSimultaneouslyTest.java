/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.SimultaneouslyThread1;
import com.svr.threads.SimultaneouslyThread2;

/**
 * @author Venkata Saripella
 *
 */
public class ThreadsSimultaneouslyTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new SimultaneouslyThread1());
        Thread thread2 = new Thread(new SimultaneouslyThread2());
        thread1.start();
        thread2.start();
    }

}
