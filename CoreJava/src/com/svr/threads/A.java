/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class A extends Thread{
    
    public void run(){
        synchronized (this) {
            try {
                wait(5000);
                System.err.println("wait completed");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        A a1 = new A();
        long  startTime = System.currentTimeMillis();
        a1.start();
        System.err.println("a1 started");
        try {
            a1.join(6000);
            System.err.println("joined compled");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
