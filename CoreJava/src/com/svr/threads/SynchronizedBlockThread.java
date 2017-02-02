/**
 * 
 */
package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class SynchronizedBlockThread implements Runnable {
    
    private String            name;
    private SynchronizedBlock synchronizedBlock;
    
    public  SynchronizedBlockThread(SynchronizedBlock theSynchronizedBlock, String theName) {
        name              = theName;
        synchronizedBlock = theSynchronizedBlock;
    }

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        synchronizedBlock.display(name);
    }

}
