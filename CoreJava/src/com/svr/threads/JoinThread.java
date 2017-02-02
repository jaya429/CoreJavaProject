/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class JoinThread implements Runnable{

    @Override
    public void run() {
        for(Integer i=0; i<10; i++){
            System.out.println("Sita Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
