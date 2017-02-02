package com.svr.threads;
/**
 * 
 */

/**
 * @author Venkata Saripella
 *
 */
public class ThreadPriority implements Runnable{

    @Override
    public void run() {

        for(Integer i=0; i<10; i++){
            System.out.println(" Child Thread " +i);
        }
    }

}
