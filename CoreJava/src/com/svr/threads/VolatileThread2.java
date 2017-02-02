/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class VolatileThread2 implements Runnable{
    
    VolatileThreadDemo volatileThreadDemo;
    
    public VolatileThread2(VolatileThreadDemo volatileThreadDemo) {
   
        this.volatileThreadDemo = volatileThreadDemo;
    }
   @Override
   public void run() {

       volatileThreadDemo.id++;
       System.out.println(volatileThreadDemo.id);
       
       
   }

    
}
