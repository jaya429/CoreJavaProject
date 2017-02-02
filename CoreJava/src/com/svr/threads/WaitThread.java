/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class WaitThread {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        NotifyThread notifyThread = new NotifyThread();
        Thread       t            = new Thread(notifyThread);
        t.start();
        synchronized (notifyThread) {
            System.out.println("main thread trying to call wait");
            notifyThread.wait();
            System.out.println("main thread got notification");
            System.out.println(notifyThread.total);
        }
    }

}
