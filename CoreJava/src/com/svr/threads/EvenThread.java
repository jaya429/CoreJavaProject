/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class EvenThread implements Runnable {

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for(Integer i=0; i<=10; i=i+2){
            System.out.println("Even Thread "+i);
        }
     }
}
