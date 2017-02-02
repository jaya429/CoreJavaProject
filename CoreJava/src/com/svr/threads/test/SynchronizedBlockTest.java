/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.SynchronizedBlock;
import com.svr.threads.SynchronizedBlockThread;

/**
 * @author Venkata Saripella
 *
 */
public class SynchronizedBlockTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        SynchronizedBlock       synchronizedBlock           = new SynchronizedBlock();
        SynchronizedBlockThread synchronizedBlockThread     = new SynchronizedBlockThread(synchronizedBlock,"Dhoni");
        SynchronizedBlockThread synchronizedBlockThread1    = new SynchronizedBlockThread(synchronizedBlock,"YU");
        
        Thread       t1   =   new Thread(synchronizedBlockThread);
        t1.setName("Dhoni");
        Thread       t2   =   new Thread(synchronizedBlockThread1);
        t2.setName("YV");
        t1.start();
        t2.start();
        
    }

}
