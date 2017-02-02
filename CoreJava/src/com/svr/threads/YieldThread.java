package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class YieldThread implements Runnable{

    @Override
    public void run() {

        for(Integer i=0; i<10; i++){
            Thread.yield();
            System.out.println("Child Thread");
        }
    }

    
}
