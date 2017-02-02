/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SynchronizedBlockClassThread implements Runnable {
    
    private String                 name;
    private SynchronizedBlockClass synchronizedBlockClass;
    
    public  SynchronizedBlockClassThread(SynchronizedBlockClass theSynchronizedBlockClass, String theName) {
        name                   = theName;
        synchronizedBlockClass = theSynchronizedBlockClass;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        synchronizedBlockClass.display(name);
    }

}
