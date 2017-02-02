/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SynchronizedBlock {

    public void display(String name){
        for(Integer index=0; index<10; index++){
            System.out.println("Synchronized block before "+index+"  "+Thread.currentThread().getName());
        }
        synchronized (this) {
            for(Integer index=0; index<100; index++){
                System.out.println(name+index);
                /*try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
            }
            
        }
        for(Integer index=0; index<10; index++){
            System.out.println("Synchronized block After "+index+"  "+Thread.currentThread().getName());
        }
    }
}
