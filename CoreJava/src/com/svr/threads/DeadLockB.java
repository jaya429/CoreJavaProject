/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class DeadLockB {
    
    public synchronized void bar(DeadLockA deadLockA){
        
        System.out.println("Thread 2 starts execution of foo() method");
        
        /*try {
            
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Thread 1 trying to call b.last()");
        }*/
        deadLockA.last();
        }
        public synchronized void last(){
        
            System.out.println("Inside DeadLockB, this is last() method");
        }
        
    }

