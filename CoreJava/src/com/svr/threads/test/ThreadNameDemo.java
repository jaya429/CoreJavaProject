/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.MyThread;

/**
 * @author Venkata Saripella
 *
 */
public class ThreadNameDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("current thread reference :: "+Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        MyThread  t = new MyThread();
        System.out.println(t.getName());
        Thread.currentThread().setName("svr");
        System.out.println(Thread.currentThread().getName());
    }

}
