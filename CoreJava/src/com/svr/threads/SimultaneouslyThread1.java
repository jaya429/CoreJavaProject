/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SimultaneouslyThread1 implements Runnable{

    @Override
    public void run() {

        ThreadsSimultaneously.method1();
    }

}
