/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class VolatileThread1 implements Runnable{
    
    VolatileThreadDemo volatileThreadDemo;
    
     public VolatileThread1(VolatileThreadDemo volatileThreadDemo) {
    
         this.volatileThreadDemo = volatileThreadDemo;
     }
    @Override
    public void run() {

        volatileThreadDemo.id++;
        System.out.println(volatileThreadDemo.id);
        
        
    }

    
}
