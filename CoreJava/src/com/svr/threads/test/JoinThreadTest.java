/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.JoinThread;

/**
 * @author Venkata Saripella
 *
 */
public class JoinThreadTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JoinThread j = new JoinThread();
        Thread     t = new Thread(j);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(Integer i=0; i<10; i++){
            System.out.println("Rama Thread");
        }
    }

}
