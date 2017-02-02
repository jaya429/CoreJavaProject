/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SynchronizedBlockClass {
    

    public void display(String name) {
        for(Integer index=0; index<5; index++){
            System.out.println("Synchronized block before "+index+"  "+Thread.currentThread().getName());
        }
        synchronized (SynchronizedBlockClass.class) {
            for(Integer index=0; index<100; index++){
                System.out.println(name+index);
                /*try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }*/
                
//                Thread.yield();
            }
            
        }
        for(Integer index=0; index<5; index++){
            System.out.println("Synchronized block After "+index+"  "+Thread.currentThread().getName());
        }
    }
   
}
