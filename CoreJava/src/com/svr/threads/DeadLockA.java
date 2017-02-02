/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class DeadLockA {

    public synchronized void foo(DeadLockB deadLockB){
        
        System.out.println("Thread 1 starts execution of foo() method");
        
       /* try {
            
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Thread 1 trying to call b.last()");
        }*/
        deadLockB.last();
        }
        public synchronized void last(){
        
            System.out.println("Inside DeadLockA, this is last() method");
        }
        
    }

