/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class OddThread implements Runnable {

    @Override
    public void run() {
        for(Integer i=1; i<=11; i=i+2){
            System.out.println("Odd  Thread "+i);
        }
    }
}
