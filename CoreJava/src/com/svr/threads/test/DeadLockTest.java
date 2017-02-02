/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.DeadLockA;
import com.svr.threads.DeadLockB;

/**
 * @author Venkata Saripella
 *
 */
public class DeadLockTest implements Runnable {
    
    DeadLockA deadLockA = new DeadLockA();
    DeadLockB deadLockB = new DeadLockB();

    public DeadLockTest(){
        Thread thread = new Thread(this);
        thread.start();
        deadLockA.foo(deadLockB);
    }
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        deadLockB.bar(deadLockA);
    }

    public static void main(String ...s){
        new DeadLockTest();
    }
}
