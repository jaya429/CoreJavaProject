/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.ObjectLevelLockThread;
import com.svr.threads.ObjectLevelLock;

/**
 * @author Venkata Saripella
 *
 */
public class ObjectLevelLockTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ObjectLevelLock   synchronizedThread             = new ObjectLevelLock();
        ObjectLevelLockThread synchronizedThreadThread1      = new ObjectLevelLockThread(synchronizedThread, "Dhoni");
        ObjectLevelLockThread synchronizedThreadThread2      = new ObjectLevelLockThread(synchronizedThread, "YV");
        Thread t1 = new Thread(synchronizedThreadThread1);
        Thread t2 = new Thread(synchronizedThreadThread2);
        t1.start();
        t2.start();
    }

}
