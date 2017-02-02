package com.svr.threads;

import static java.lang.Thread.currentThread;
/**
 * @author Venkata Saripella
 *
 */
public class StopThread {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {

        Server myServer = new Server(); 
        Thread t1 = new Thread(myServer, "T1"); 
        t1.start(); 
        t1.join();
        System.out.println(t1.isAlive());
        
       /* //Now, let's stop our Server thread 
        System.out.println(currentThread().getName() + " is stopping Server thread");
        myServer.stop(); 
        //Let's wait to see server thread stopped 
        TimeUnit.MILLISECONDS.sleep(200); 
        System.out.println(currentThread().getName() + " is finished now");*/

        System.out.println(currentThread().getName() + " is finished now");
    }

}
