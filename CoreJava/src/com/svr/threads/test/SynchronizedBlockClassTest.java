/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.SynchronizedBlockClass;
import com.svr.threads.SynchronizedBlockClassThread;

/**
 * @author Venkata Saripella
 *
 */
public class SynchronizedBlockClassTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        SynchronizedBlockClass       synchronizedBlock           = new SynchronizedBlockClass();
        SynchronizedBlockClassThread synchronizedBlockThread     = new SynchronizedBlockClassThread(synchronizedBlock,"Dhoni");
        SynchronizedBlockClassThread synchronizedBlockThread1    = new SynchronizedBlockClassThread(synchronizedBlock,"YU");
        
        SynchronizedBlockClassThread synchronizedBlockThrea2     = new SynchronizedBlockClassThread(synchronizedBlock,"Venkata");
        SynchronizedBlockClassThread synchronizedBlockThread3    = new SynchronizedBlockClassThread(synchronizedBlock,"Kiran");
        
        Thread       t1   =   new Thread(synchronizedBlockThread);
        t1.setName("Dhoni");
        Thread       t2   =   new Thread(synchronizedBlockThread1);
        t2.setName("YV");
        
        Thread       t3   =   new Thread(synchronizedBlockThrea2);
        t3.setName("Venkata");
        Thread       t4   =   new Thread(synchronizedBlockThread3);
        t4.setName("Kiran");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
