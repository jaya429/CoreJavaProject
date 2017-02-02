/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class VolatileThreadDemo {
    
    volatile  int id = 0;
    
    public static void main(String ...s){
        
       VolatileThreadDemo volatileThreadDemo = new VolatileThreadDemo();
       
       new Thread(new VolatileThread1(volatileThreadDemo)).start();
       new Thread(new VolatileThread2(volatileThreadDemo)).start();
       new Thread(new VolatileThread3(volatileThreadDemo)).start();
       new Thread(new VolatileThread4(volatileThreadDemo)).start();
    }
}
