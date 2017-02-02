/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.ClassLevelLockThread;

/**
 * @author Venkata Saripella
 *
 */
public class ClassLevelLockTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ClassLevelLockThread classLevelLockThread1  = new ClassLevelLockThread("Dhoni");
        ClassLevelLockThread classLevelLockThread2  = new ClassLevelLockThread("YV");
        Thread t1 = new Thread(classLevelLockThread1);
        Thread t2 = new Thread(classLevelLockThread2);
        t1.start();
        t2.start();
    }

}
