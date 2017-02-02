/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class Server implements Runnable{
    private volatile boolean exit = false; 
    public void run() { 
        System.out.println("server is running.....");
        /*while(!exit){
            System.out.println("Server is running....."); 
            } 
        System.out.println("Server is stopped....");*/
        return;
       } 
    public void stop(){ 
        exit = true; 
    }


}
