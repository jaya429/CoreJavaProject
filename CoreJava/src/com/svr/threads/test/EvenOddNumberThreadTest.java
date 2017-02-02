/**
 * 
 */
package com.svr.threads.test;

import com.svr.threads.EvenNumberGenerator;
import com.svr.threads.NumberPrinter;
import com.svr.threads.OddNumberGenerator;

/**
 * @author Venkata Saripella
 *
 */
public class EvenOddNumberThreadTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Integer       maxNumber       = 10;
        NumberPrinter numberPrienter  = new NumberPrinter();
        
        new Thread(new EvenNumberGenerator(numberPrienter, maxNumber)).start();
        new Thread(new OddNumberGenerator(numberPrienter, maxNumber)).start();
    }

}
