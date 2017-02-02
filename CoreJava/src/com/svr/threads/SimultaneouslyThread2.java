package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SimultaneouslyThread2 implements Runnable{

    @Override
    public void run() {

        ThreadsSimultaneously.method2();
    }

}
