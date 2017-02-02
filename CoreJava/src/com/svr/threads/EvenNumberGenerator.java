package com.svr.threads;

/**
 * @author Venkata Saripella
 *
 */
public class EvenNumberGenerator implements Runnable {

    private NumberPrinter numberPrinter;
    private Integer       maxValue;

    public EvenNumberGenerator(NumberPrinter numberPrinter, Integer maxValue){
        this.numberPrinter   = numberPrinter;
        this.maxValue        = maxValue;
    }
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        for(Integer i=2; i<maxValue; i+=2){
            try {
                numberPrinter.printEven(i);
           } catch (Exception e) {
               e.printStackTrace();
           }
        }
    }

}
