/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.ThreadPriority;

/**
 * @author Venkata Saripella
 *
 */
public class ThreadPriorityTest {
    
    public static void main(String ...args){
        
        ThreadPriority tp = new ThreadPriority();
        Thread         t  = new Thread(tp);
        t.setPriority(10);
        t.start();
        for(Integer i=0; i<10; i++){
            System.out.println(" Main Thread " +i);
        }
    }
    
}
