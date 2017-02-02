/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class VolatileThread4 implements Runnable{
    
    VolatileThreadDemo volatileThreadDemo;
    
    public VolatileThread4(VolatileThreadDemo volatileThreadDemo) {
   
        this.volatileThreadDemo = volatileThreadDemo;
    }
   @Override
   public void run() {

       volatileThreadDemo.id++;
       System.out.println(volatileThreadDemo.id);
       
       
   }
    
}
