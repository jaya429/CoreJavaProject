/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.YieldThread;

/**
 * @author Venkata Saripella
 *
 */
public class YieldThreadTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        YieldThread yield = new YieldThread();
        Thread          t = new Thread(yield);
        t.start();
        for(Integer i=0; i<10; i++){
            System.out.println("Main Thread");
        }
        
    }

}
