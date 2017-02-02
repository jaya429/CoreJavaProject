/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SingleLineDeadLoak {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println(" "+e);
        }
    }

}
