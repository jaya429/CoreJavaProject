package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class OddNumberGenerator implements Runnable {

    private NumberPrinter numberPrinter;
    private Integer       maxValue;

    public OddNumberGenerator(NumberPrinter numberPrinter, Integer maxValue){
        this.numberPrinter   = numberPrinter;
        this.maxValue        = maxValue;
    }
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
        @Override
        public void run() {
           
            for(Integer i=1; i<maxValue; i+=2){
                try {
                    numberPrinter.printOdd(i);
               } catch (Exception e) {
                   e.printStackTrace();
               }
            }
            
        }
    }
