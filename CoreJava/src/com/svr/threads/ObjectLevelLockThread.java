/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class ObjectLevelLockThread implements Runnable{

    ObjectLevelLock objectLevelLock;
    String             name;
    public ObjectLevelLockThread(ObjectLevelLock objectLevelLock, String name){
        this.objectLevelLock = objectLevelLock;
        this.name               = name;
    }
    @Override
    public void run(){
        objectLevelLock.wish(name);
    }
}
