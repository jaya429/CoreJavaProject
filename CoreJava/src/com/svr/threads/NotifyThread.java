/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class NotifyThread implements Runnable{

    Integer total = 0;
    @Override
    public void run() {
        synchronized(this){
            System.out.println("child thread starts calculation");
            for(Integer index=0; index<100; index++){
                total+=index;
            }
            System.out.println("child thread giving notigication call");
            this.notify();
        }
    }

}
