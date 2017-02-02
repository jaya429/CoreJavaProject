/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class InterruptThread implements Runnable {

    @Override
    public void run() {

        try {
        for(Integer i=0; i<10; i++){
            System.out.println("I am lazy Thread "+i);
                Thread.sleep(3000);
         }
         }catch (InterruptedException e) {
            System.out.println("I got Interrupted");
            e.printStackTrace();
        }
    }

    
}
