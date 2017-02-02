/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class ClassLevelLockThread implements Runnable{

    String             name;
    public ClassLevelLockThread(String name){
        this.name           = name;
    }
    @Override
    public void run() {
        ClassLevelLock.wish(name);
    }

}
